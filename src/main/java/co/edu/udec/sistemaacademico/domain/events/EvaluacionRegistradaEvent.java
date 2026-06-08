package co.edu.udec.sistemaacademico.domain.events;

import java.time.Instant;

public record EvaluacionRegistradaEvent(
        String idEvaluacion,
        Instant fechaRegistro
) {
}