package Controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("http://localhost:63342/ForeCastGlobant/Vista/Assets/Formulario/formulario.html?")
public class EnviarDatosJavaScript {


    @GetMapping("/formulario")
    public String getMessage() {
        return "Hola desde el controlador";
    }
}
