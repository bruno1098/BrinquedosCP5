package br.com.fiap.CP5Java.Controller;

import br.com.fiap.CP5Java.Model.Brinquedo;
import br.com.fiap.CP5Java.Repository.BrinquedoRepository;
import br.com.fiap.CP5Java.Service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    @Autowired
    private BrinquedoService brinquedoService;


    @GetMapping
    public String listarBrinquedos(Model model) {
        List<Brinquedo> brinquedos = brinquedoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        model.addAttribute("brinquedos", brinquedos);
        return "listar";
    }



    @GetMapping("/novo")
    public String novoBrinquedoForm(Model model) {
        model.addAttribute("brinquedo", new Brinquedo());
        return "brinquedo";
    }


    @PostMapping
    public String salvarBrinquedo(Brinquedo brinquedo) {
        brinquedoRepository.save(brinquedo);
        return "redirect:/brinquedos";
    }



    @GetMapping("/editar/{id}")
    public String editarBrinquedoForm(@PathVariable Long id, Model model) {
        Brinquedo brinquedo = brinquedoService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("brinquedo", brinquedo);
        return "editar";
    }

    @PostMapping("/editar")
    public String atualizarBrinquedo(Brinquedo brinquedo) {
        Brinquedo brinquedoExistente = brinquedoRepository.findById(brinquedo.getId())
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + brinquedo.getId()));


        brinquedoExistente.setNome(brinquedo.getNome());
        brinquedoExistente.setDescricao(brinquedo.getDescricao());


        brinquedoRepository.save(brinquedoExistente);


        return "redirect:/brinquedos";
    }



    @PostMapping("/deletar")
    public String deletarBrinquedo(@RequestParam("id") Long id) {
        Brinquedo brinquedo = brinquedoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Brinquedo inválido: " + id));
        brinquedoRepository.delete(brinquedo);
        return "redirect:/brinquedos";
    }
}
