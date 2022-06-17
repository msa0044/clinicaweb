function post(data) {
    fetch("http://localhost:8080/paciente", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
    }).then((promisseResponse) =>  {
        console.log(promisseResponse);
        if(promisseResponse.status == 200 || promisseResponse.status == 201) {
            promisseResponse.json().then((response) => {
                // console.log(response.body)
                console.log(response.uri)
            });
        } else {
            alert('Erro')
        }
        
    })
    .catch((error) => {
        console.error("Error:", error);
    });
        
}

function teste(response) {

}

teste(response => {

})

function criarObjeto() {    
    var obj = {
        "id": null,
        "nome": "",
        "idade": 34,
        "rua": "",
        "numero": 1,
        "bairro": "",
        "cidade": "",
        "estado": "",
        "telefone": "",
        "email": "",
        "senha": "",
        "cpf": ""
    };
    obj.nome = document.getElementById("nome").value;
    obj.cpf = document.getElementById("cpf").value;
    obj.idade = document.getElementById("idade").value;
    obj.rua = document.getElementById("rua").value;
    obj.numero = document.getElementById("numero").value;
    obj.bairro = document.getElementById("bairro").value;
    obj.cidade = document.getElementById("cidade").value;
    obj.estado = document.getElementById("estado").value;
    obj.telefone = document.getElementById("telefone").value;
    obj.email = document.getElementById("email").value;
    obj.senha = document.getElementById("senha").value;

    post(obj);
}