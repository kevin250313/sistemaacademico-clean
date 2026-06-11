package co.edu.udec.sistemaacademico.application.dto;

public record AlumnosSobrePromedioResponse(

        String matricula,
        String nombre,
        String grupo,
        double nota

) {
}
