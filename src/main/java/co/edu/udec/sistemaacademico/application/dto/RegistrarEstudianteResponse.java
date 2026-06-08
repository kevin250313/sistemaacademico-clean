package co.edu.udec.application.dto;

public record RegistrarEstudianteResponse(
        String matricula,
        String nombre,
        String correo,
        String grupo
) {
}