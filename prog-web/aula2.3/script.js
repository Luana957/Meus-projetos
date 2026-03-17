document.getElementById('numeroForm').addEventListener('submit', function(event)
{
event.preventDefault(); // Impede o envio do formulário
// Obtém o valor do número digitado
const numero = parseFloat(document.getElementById('numero').value);
const numero1 = parseFloat(document.getElementById('numero').value);
const numero2 = parseFloat(document.getElementById('numero').value);

// Chama a função para calcular o quadrado
const resultado = calcularQuadrado(numero, numero1,numero2); //const variavel local 
 
// Exibe o resultado na página
document.getElementById('resultado').textContent = resultado;
});

///conserte depois ta errado

function calcularTotal(numero,numero1,numero2) {
return numero * numero2;

}

function cacularTaxaMes(numero,numero1,numero2){
    return (numero/ numero1)* numero2
}