package co.edu.udec.sistemaacademico.application.dto;

public record RegistrarControlEscritoRequest(

        String idControl,
        String matriculaAlumno,
        double nota,
        String fecha

) {
}
