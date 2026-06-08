package co.edu.udec.sistemaacademico.domain.valueobjects;

public record CorreoElectronico(String value) {

    public CorreoElectronico {

        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException(
                    "Correo electrónico inválido");
        }
    }
}