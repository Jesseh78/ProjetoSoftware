const form = document.getElementById("formPagamento")

form.addEventListener("submit", (event) =>{
    event.preventDefault();

    const tipo = document.getElementById("tipo").value
    const nomeCliente = document.getElementById("campoNome").value
    const descricao = document.getElementById("descricao").value
    const valor = parseFloat(document.getElementById("valor").value)
    const data = document.getElementById("dataPagamento").value

    const dados = {
        tipo : tipo,
        nomeCliente : nomeCliente,
        descricao : descricao,
        dataPagamento : dataPagamento,
        valor : valor 
    }

    fetch("http://localhost:8080/pagamentos",{
        method: "POST",
        headers: {
            'Content-type' : 'application/json'
        },
        body: JSON.stringify(dados)
    })
    .then(response => {
        console.log(response.ok);
        
    })

})