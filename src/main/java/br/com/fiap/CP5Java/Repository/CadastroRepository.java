package br.com.fiap.CP5Java.Repository;

import br.com.fiap.CP5Java.Model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    Optional<Cadastro> findByEmail(String email);
}
