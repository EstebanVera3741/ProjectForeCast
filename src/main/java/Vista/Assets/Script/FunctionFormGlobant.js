var nombreCompleto, tipoID, numeroIdentificacion, generacion,
correoElectronico, institucion, ciudad, departamento, fechaIL,
fechaFL, fechaIP, fechaFP;

function cambioValor(){
    nombreCompleto = document.getElementById("inputName1").value;
    tipoID = document.getElementById("inputTipoId").value;
    numeroIdentificacion = document.getElementById("inputId1").value;
    generacion = document.getElementById("inputGeneration1").value;
    correoElectronico = document.getElementById("inputEmail3").value;
    institucion = document.getElementById("inputEducation").value;
    ciudad = document.getElementById("inputCity").value;
    departamento = document.getElementById("inputDepartment").value;
    fechaIL = document.getElementById("inputDate1").value;
    fechaFL = document.getElementById("inputDate2").value;
    fechaIP = document.getElementById("inputDate3").value;
    fechaFP = document.getElementById("inputDate4").value;

    console.log(nombreCompleto, tipoID, numeroIdentificacion, generacion,
        correoElectronico, institucion, ciudad, departamento, fechaIL,
        fechaFL, fechaIP, fechaFP)
}

function dataCollection(){

    var registro = {
        nombreCompleto, tipoID, numeroIdentificacion, generacion,
        correoElectronico, institucion, ciudad, departamento, fechaIL,
        fechaFL, fechaIP, fechaFP
    }


    fetch('http://localhost:63342/ForeCastGlobant/Vista/Assets/Formulario/formulario.html?', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(registro)
    })
    .then(response => response.text())
    .then(data => console.log(data))
    .catch(error => console.error(error));

    
}