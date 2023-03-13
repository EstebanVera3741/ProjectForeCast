
function recibirDatos(){

    fetch('/formulario')
    .then(response => response.text())
    .then(data => {
      console.log(data);
    });
}

