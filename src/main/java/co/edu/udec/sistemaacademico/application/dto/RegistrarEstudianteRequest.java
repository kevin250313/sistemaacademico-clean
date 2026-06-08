package co.edu.udec.application.dto;

public record RegistrarEstudianteRequest(
        String matricula,
        String nombre,
        String correo,
        String grupo
) {
}
