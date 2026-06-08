package co.edu.udec.sistemaacademico.domain.valueobjects;

public record Nota(double value) {

    public Nota {

        if (value < 0 || value > 5) {
            throw new IllegalArgumentException(
                    "La nota debe estar entre 0 y 5");
        }
    }
}
