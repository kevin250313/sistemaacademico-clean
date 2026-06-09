package co.edu.udec.sistemaacademico.application.dto;

public record BuscarEstudianteResponse(
        String matricula,
        String nombre,
        String correo,
        String grupo
) {
}
