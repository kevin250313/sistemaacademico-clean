package co.edu.udec.sistemaacademico.application.dto;

public record ActualizarEstudianteResponse(

        String matricula,
        String nombre,
        String correo,
        String grupo

) {
}