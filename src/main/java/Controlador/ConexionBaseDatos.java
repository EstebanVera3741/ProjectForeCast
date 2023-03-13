package Controlador;


import Modelo.EntidadPatrocinada.EstudiantePatrocinado.EstudiantePatrocinadoDeGlobant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ConexionBaseDatos {


    @PostMapping("http://localhost:63342/ForeCastGlobant/Vista/Assets/Formulario/formulario.html?")
    public ResponseEntity<String> addUser(@RequestBody EstudiantePatrocinadoDeGlobant
                                                      estudiantePatrocinadoDeGlobant) {

        return ResponseEntity.ok("prueba exitosa");
    }

}
