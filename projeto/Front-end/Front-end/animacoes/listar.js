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
    tabelaPagamentos.innerHTML = ""

    dados.forEach(pagamentos => {
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

    let btnEditar = document.createElement("button")
    btnEditar.textContent = "Editar"
    btnEditar.className = "btn-editar"
    btnEditar.dataset.id = pagamentos.id

    btnEditar.addEventListener("click", () => {
        abrirFormulario(pagamentos)
    })

    let btnExcluir = document.createElement("button")
    btnExcluir.textContent = "Excluir"
    btnExcluir.className = "btn-excluir"
    btnExcluir.dataset.id = pagamentos.id

    //criar td acoes
    let acoes = document.createElement("td")
    acoes.appendChild(btnEditar)
    acoes.appendChild(btnExcluir)


    linhaPagamento.appendChild(tipoPagamentoTd)
    linhaPagamento.appendChild(nomeCliente)
    linhaPagamento.appendChild(descricao)
    linhaPagamento.appendChild(data)
    linhaPagamento.appendChild(valor)
    linhaPagamento.appendChild(acoes)
    tabelaPagamentos.appendChild(linhaPagamento)
    }); 
}

function abrirFormulario(pagamentos){
    let formEdicao = document.getElementById("formEdicao")
    formEdicao.style.display="block"
    document.getElementById("editNome").value = pagamentos.nomeCliente
    document.getElementById("editDescricao").value = pagamentos.descricao
    document.getElementById("editValor").value = pagamentos.valor
    document.getElementById("editData").value = pagamentos.data


}

function cancelarEdicao(){
    let formEdicao = document.getElementById("formEdicao")
    formEdicao.style.display="none"
}