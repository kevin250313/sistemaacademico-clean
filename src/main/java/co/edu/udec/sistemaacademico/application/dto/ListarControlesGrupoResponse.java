package co.edu.udec.sistemaacademico.application.dto;

public record ListarControlesGrupoResponse(

        String idControl,
        String matriculaAlumno,
        String nombreAlumno,
        String grupo,
        double nota

) {
}