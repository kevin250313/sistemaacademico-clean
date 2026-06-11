package co.edu.udec.sistemaacademico.application.dto;

public record ObtenerNotaControlResponse(

        String idControl,
        String matriculaAlumno,
        double nota

) {
}
