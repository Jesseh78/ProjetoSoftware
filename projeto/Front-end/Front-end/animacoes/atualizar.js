function salvarEdicao(){
    const id = document.querySelector("#editId").value
    const nomeCliente = document.querySelector("#editNome").value
    const descricao = document.querySelector("#editDescricao").value
    const data = document.querySelector("#editData").value
    const valor = parseFloat(document.querySelector("#editValor").value)

    const dadosAtualizados = {
        id: id,
        nomeCliente: nomeCliente,
        descricao: descricao,
        data: data,
        valor: valor
    }
    fetch(`http://localhost:8080/pagamentos` ,{
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(dadosAtualizados)
    })   .then(res => {
        if(res.ok){
            alert("Alterações salvas!")
            document.querySelector("#formEdicao").computedStyleMap.display = "none"
            buscaPagamentos()
        } else {
            alert("Erro ao salvar")
        }
    }) .catch(error => {
        alert("Erro de comunicação com o servidor")
    })
}