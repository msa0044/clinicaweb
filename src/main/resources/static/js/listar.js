function get(url) {
    let request = new XMLHttpRequest()
    request.open("GET", url, false)
    request.send()
    return JSON.parse(request.responseText)
}

function listarPaciente() {
    url = "http://localhost:8080/paciente/get/";
    let i = 1
    let o = get(url+i)

    while (o.nome != undefined) {

        tdId = document.createElement("td")
        tdNome = document.createElement("td")
        tdCPF = document.createElement("td")
        tdIdade = document.createElement("td")
        tdRua = document.createElement("td")
        tdNumero = document.createElement("td")
        tdBairro = document.createElement("td")
        tdCidade = document.createElement("td")
        tdEstado = document.createElement("td")
        tdTelefone = document.createElement("td")
        tdEmail = document.createElement("td")
        tdSenha = document.createElement("td")

        tdId.innerHTML = o.id
        tdNome.innerHTML = o.nome
        tdCPF.innerHTML = o.cpf
        tdIdade.innerHTML = o.idade
        tdRua.innerHTML = o.rua
        tdNumero.innerHTML = o.numero
        tdBairro.innerHTML = o.bairro
        tdCidade.innerHTML = o.cidade
        tdEstado.innerHTML = o.estado
        tdTelefone.innerHTML = o.telefone
        tdEmail.innerHTML = o.email
        tdSenha.innerHTML = o.senha

        tr = document.createElement("tr")

        tr.appendChild(tdId)
        tr.appendChild(tdNome)
        tr.appendChild(tdCPF)
        tr.appendChild(tdIdade)
        tr.appendChild(tdRua)
        tr.appendChild(tdNumero)
        tr.appendChild(tdBairro)
        tr.appendChild(tdCidade)
        tr.appendChild(tdEstado)
        tr.appendChild(tdTelefone)
        tr.appendChild(tdEmail)
        tr.appendChild(tdSenha)

        lista = document.getElementById("txtjson")

        lista.appendChild(tr)

        tr.querySelectorAll('td').forEach(element => {
            element.style.backgroundColor = 'rgb(0, 138, 92, 0.100)'
            element.style.borderRadius = '5px'
            element.style.color = 'rgb(0, 138, 92)'
        });
        i++
        o = get(url+i)
    }


}
