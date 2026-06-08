package co.edu.udec.sistemaacademico.domain.valueobjects;

public record CodigoAsignatura(String value) {

    public CodigoAsignatura {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "El código de asignatura no puede estar vacío");
        }
    }
}
