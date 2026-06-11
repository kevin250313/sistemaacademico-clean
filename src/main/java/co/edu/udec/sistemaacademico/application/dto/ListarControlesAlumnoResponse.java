package co.edu.udec.sistemaacademico.application.dto;

public record ListarControlesAlumnoResponse(

        String idControl,
        String matriculaAlumno,
        double nota,
        String fecha

) {
}