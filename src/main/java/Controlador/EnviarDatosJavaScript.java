package Controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController()
public class EnviarDatosJavaScript {

    @GetMapping(value = "/")
    public String holaMundo(){
        return "hola mundo";
    }


    
}
