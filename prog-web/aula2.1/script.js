document.getElementById('numeroForm').addEventListener('submit', function(event)
{
event.preventDefault(); // Impede o envio do formulário
// Obtém o valor do número digitado
const numero = parseFloat(document.getElementById('numero').value);


    // 2. Pega o elemento SELECT (pelo nome ou adicionando um ID a ele)
    // No seu HTML, o select tem name="selecao". Vamos usar querySelector:
    const selecao = document.querySelector('select[name="selecao"]').value;

    let resultado;

    // 3. Verifica qual opção foi escolhida no valor do Select
    if (selecao === "1") {
        // Opção Quadrado (value="1")
        resultado = calcularQuadrado(numero);
    } else if (selecao === "2") {
        // Opção Cubo (value="2")
        resultado = calcularCubo(numero);
    }

    // 4. Exibe o resultado
    document.getElementById('resultado').textContent = resultado;
});


function calcularQuadrado(resultado){
    return  numero * numero;
}

function calcularCubo(resultado){
    return  numero * numero * numero;
}