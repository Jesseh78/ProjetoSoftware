function buscaPagamentos(){
    let tipoPagamento = document.getElementById("filtroTipo").value
    console.log(`http://localhost:8080/pagamentos/tipo/${tipoPagamento}`);
    fetch(`http://localhost:8080/pagamentos/tipo/${tipoPagamento}`)
    .then (res => res.json())
    .then (dados =>{
        console.log(dados)
        exibePagamentos(dados);
    })
}

let tabelaPagamentos = document.getElementById("tabelaPagamentos")

function exibePagamentos(dados){
    let pagamentos = dados[0]
    // cria os elementos da tabela
    let linhaPagamento = document.createElement("tr")
    let tipoPagamentoTd = document.createElement("td")
    let nomeCliente = document.createElement("td")
    let descricao = document.createElement("td")
    let data = document.createElement("td")
    let valor = document.createElement("td")

    // Adiciona as informações nas tags em HTML a partir do JSON retornado da API
    tipoPagamentoTd.textContent = pagamentos.tipo
    nomeCliente.textContent = pagamentos.nomeCliente
    descricao.textContent = pagamentos.descricao
    data.textContent = pagamentos.dataPagamento
    valor.textContent = "R$" + parseFloat(pagamentos.valor).toFixed(2)

    linhaPagamento.appendChild(tipoPagamentoTd)
    linhaPagamento.appendChild(nomeCliente)
    linhaPagamento.appendChild(descricao)
    linhaPagamento.appendChild(data)
    linhaPagamento.appendChild(valor)

    tabelaPagamentos.appendChild(linhaPagamento)



}