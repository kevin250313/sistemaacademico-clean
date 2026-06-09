package co.edu.udec.sistemaacademico.application.dto;

public record RegistrarEstudianteResponse(
        String matricula,
        String nombre,
        String correo,
        String grupo
) {
}