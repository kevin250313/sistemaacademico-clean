package co.edu.udec.sistemaacademico.domain.valueobjects;

public record Matricula(String value) {

    public Matricula {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "La matrícula no puede estar vacía");
        }
    }
}