package co.edu.udec.sistemaacademico.domain.services;

import co.edu.udec.sistemaacademico.domain.model.Estudiante;
import co.edu.udec.sistemaacademico.domain.valueobjects.Nota;

public class EvaluacionDomainService {

    public boolean aprobarEvaluacion(
            Estudiante estudiante,
            Nota nota) {

        return estudiante != null
                && nota != null
                && nota.value() >= 3.0;
    }
}