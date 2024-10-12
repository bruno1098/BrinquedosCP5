document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('toyRegisterForm');
    const statusDiv = document.getElementById('registerStatus');

    form.addEventListener('submit', function (event) {
        event.preventDefault();

        const nomeBrinquedo = document.getElementById('nomeBrinquedo').value;
        const tipoBrinquedo = document.getElementById('tipoBrinquedo').value;
        const fabricante = document.getElementById('fabricante').value;
        const preco = document.getElementById('preco').value;

        if (nomeBrinquedo && tipoBrinquedo && fabricante && preco) {
            statusDiv.style.color = 'green';
            statusDiv.textContent = 'Brinquedo registrado com sucesso!';
        } else {
            statusDiv.style.color = 'red';
            statusDiv.textContent = 'Preencha todos os campos corretamente.';
        }

        form.reset();
    });
});
