package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteResponse;

public interface RegistrarEstudianteUseCase {

    RegistrarEstudianteResponse ejecutar(
            RegistrarEstudianteRequest request);
}
