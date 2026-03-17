var area = document.getElementById('area');
function entrar() {
var nome = prompt("Digite seu nome:"); //caixinha

if (nome === '' || nome === null) {

 let btntentar=document.createElement("botton");
 btntentar.innerText ="Tentar novamente!";
 btntentar.onclick = entrar;
 area.appendChild(btntentar);

//area.innerHTML = "Clique no botão para acessar...";
} else {
area.innerHTML = "Bem-vindo, " + nome + "! ";

// Cria um botão "Sair da conta"
let divSair = document.createElement("div");
divSair.innerText = "Sair da conta";
divSair.onclick = sair;
area.appendChild(divSair); // Adiciona o botão ao DOM
}
}

function sair() {
alert("Até mais!");
area.innerHTML = "Você saiu!";
}