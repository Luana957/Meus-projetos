 const express = require('express');
const app = express();
const path = require('path');
const porta = 3000;

// Configura o Node para servir seus arquivos (HTML, CSS, imagens)
app.use(express.static(__dirname));

// Rota principal que entrega o seu index.html
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

app.listen(porta, () => {
    console.log(`✅ Servidor bombando em http://localhost:${porta}`);
});
