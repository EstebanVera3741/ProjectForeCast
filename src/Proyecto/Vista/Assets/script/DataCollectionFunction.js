let randomss = "pruebaaaaaaaaaaaaaa: ";

function cambioValor() {

    console.log(randomss , document.getElementById("inputName1").value);

}


function DataCollection() {

    let nombre = document.getElementById("inputName1").value;
    let tipoID = document.getElementById("inputTipoId").value;
    let identificacion = document.getElementById("inputId1").value;
    let generacion = document.getElementById("inputGeneration1").value;
    let correoElectronico = document.getElementById("inputEmail3").value;
    let institucionEducativa = document.getElementById("inputEducation").value;
    let departamento = document.getElementById("inputDepartment").value;
    let ciudad = document.getElementById("inputCity").value;
    let fechaIL = document.getElementById("inputDate1").value;
    let fechaFL = document.getElementById("inputDate2").value;
    let fechaIP = document.getElementById("inputDate3").value;
    let fechaFP = document.getElementById("inputDate4").value;

    

    let registro = {
        nombre, 
        tipoId, 
        identificacion,
        generacion,
        correoElectronico,
        institucionEducativa,
        departamento,
        ciudad,
        fechaIL,
        fechaFL,
        fechaIP,
        fechaFP

    };


    fetch(url, {
        method: 'POST',
        body: JSON.stringify(registro), 
        headers: {
          'Content-Type': 'application/json' 
        }
      })
      .then(response => response.json())
      .then(data => console.log(data))
      .catch(error => console.error(error));
   
}