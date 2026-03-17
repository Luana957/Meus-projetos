// Vetor para armazenar os dados
let vendas = [];
let contadorId = 1;

function atualizarLista() {
    const tabela = document.getElementById('corpoTabela');
    const info = document.getElementById('info');
    
    // Limpa a tabela antes de reconstruir
    tabela.innerHTML = '';
    let totalGeral = 0;

    // Se não houver vendas
    if (vendas.length === 0) {
        tabela.innerHTML = '<tr><td colspan="7">Nenhuma venda cadastrada</td></tr>';
        info.innerHTML = 'Total: R$ 0,00';
        return;
    }

    // Percorre o vetor e cria as linhas (Template igual ao seu modelo)
    for (let i = 0; i < vendas.length; i++) {
        const v = vendas[i];
        totalGeral += v.valorComDesconto;

        const linha = document.createElement('tr');
        linha.innerHTML = `
            <td>${v.id}</td>
            <td>${v.vendedor}</td>
            <td>R$ ${v.valorBruto.toFixed(2)}</td>
            <td>R$ ${v.desconto.toFixed(2)}</td>
            <td>R$ ${v.valorComDesconto.toFixed(2)}</td>
            <td>${v.data}</td>
            <td><button onclick="removerVenda(${v.id})">Remover</button></td>
        `;
        tabela.appendChild(linha);
    }

    info.innerHTML = `Total Acumulado: R$ ${totalGeral.toFixed(2)}`;
}

function cadastrarVenda() {
    const nomeInput = document.getElementById('vendedor');
    const valorInput = document.getElementById('valorVenda');

    // Validação simples
    if (nomeInput.value === '' || valorInput.value === '') {
        alert("Preencha os campos!");
        return;
    }

    const valorOriginal = parseFloat(valorInput.value);
    const calculoDesconto = valorOriginal * 0.10;
    const valorFinal = valorOriginal - calculoDesconto;

    // Criar o objeto da venda
    const novaVenda = {
        id: contadorId++,
        vendedor: nomeInput.value,
        valorBruto: valorOriginal,
        desconto: calculoDesconto,
        valorComDesconto: valorFinal,
        data: new Date().toLocaleString()
    };

    // PUSH no vetor (conforme seu modelo)
    vendas.push(novaVenda);

    // Limpar campos
    nomeInput.value = '';
    valorInput.value = '';
    nomeInput.focus();

    // Atualizar a tela
    atualizarLista();
}

function removerVenda(idParaRemover) {
    // Remove do vetor filtrando pelo ID
    vendas = vendas.filter(item => item.id !== idParaRemover);
    atualizarLista();
}

// Inicia a lista vazia ao carregar a página
atualizarLista();
