package co.edu.udec.sistemaacademico.domain.model;

import co.edu.udec.sistemaacademico.domain.enums.TipoEvaluacion;
import co.edu.udec.sistemaacademico.domain.valueobjects.Nota;

public class Evaluacion {

    private final String id;
    private TipoEvaluacion tipo;
    private Nota nota;

    public Evaluacion(
            String id,
            TipoEvaluacion tipo,
            Nota nota) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException(
                    "El id de evaluación es obligatorio");
        }

        this.id = id;
        this.tipo = tipo;
        this.nota = nota;
    }

    public String getId() {
        return id;
    }

    public TipoEvaluacion getTipo() {
        return tipo;
    }

    public Nota getNota() {
        return nota;
    }
}
