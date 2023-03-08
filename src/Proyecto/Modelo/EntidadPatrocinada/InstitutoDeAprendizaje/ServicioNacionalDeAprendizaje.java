package Proyecto.Modelo.EntidadPatrocinada.InstitutoDeAprendizaje;

import Proyecto.Modelo.EntidadPatrocinada.EstudiantePatrocinado.EstudiantePatrocinadoDeGlobant;

import java.util.ArrayList;
import java.util.List;

public class ServicioNacionalDeAprendizaje {

    private List<EstudiantePatrocinadoDeGlobant> listaEstudiantesPatrocinadosSENA = new ArrayList<>();

    public ServicioNacionalDeAprendizaje() {
    }

    public List<EstudiantePatrocinadoDeGlobant> getListaEstudiantesPatrocinadosSENA() {
        return listaEstudiantesPatrocinadosSENA;
    }
}
