package co.edu.udec.sistemaacademico.application.dto;

public record ActualizarEstudianteRequest(

        String matricula,
        String nombre,
        String correo,
        String grupo

) {
}