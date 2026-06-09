package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteResponse;

public interface ActualizarEstudianteUseCase {

    ActualizarEstudianteResponse ejecutar(
            ActualizarEstudianteRequest request
    );
}
