package co.edu.udec.sistemaacademico.application.dto;

public record ListarEstudianteResponse(
        String matricula,
        String nombre,
        String correo,
        String grupo
) {
}
