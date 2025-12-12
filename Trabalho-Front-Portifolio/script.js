//Alert
alert("Bem-vindo ao nosso site Mecximus, Uma equipe de excelência.");

//Localizar o botao
let botao = document.getElementById("VerificarButton");
console.log(botao);


// 1. Verificar se o botão foi encontrado antes de tentar adicionar o evento
if (botao) {
    // 2. Adicionar o ouvinte de evento de clique
    botao.addEventListener("click", function() {
        
        // 3. Alternar a classe 'dark-mode' no corpo do documento
        document.body.classList.toggle('dark-mode');
        
        // Log no console para confirmar que a ação ocorreu
        console.log("Tema alternado!");
    });
} else {
    console.error("Erro: O elemento com id='verificarButton' não foi encontrado.");
}



// 1. Encontre o botão e o conteúdo no HTML
const botaoToggle = document.getElementById("toggleButton");
const areaConteudo = document.getElementById("conteudoOculto");

// 2. Verifique se o botão existe antes de tentar adicionar o evento
if (botaoToggle && areaConteudo) {
    
    // 3. Adicione um ouvinte de evento (o que acontece quando clica)
    botaoToggle.addEventListener("click", function() {
        
        // 4. A AÇÃO PRINCIPAL: Alternar a classe 'visivel' no conteúdo
        areaConteudo.classList.toggle('visivel');
        
        console.log("Conteúdo oculto foi alternado.");
    });
    
} else {
    console.error("Erro: Botão ou Conteúdo não encontrado. Verifique os IDs.");
}