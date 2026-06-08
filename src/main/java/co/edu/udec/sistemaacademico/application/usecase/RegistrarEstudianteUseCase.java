package co.edu.udec.application.usecase;

import co.edu.udec.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.application.dto.RegistrarEstudianteResponse;

public interface RegistrarEstudianteUseCase {

    RegistrarEstudianteResponse ejecutar(
            RegistrarEstudianteRequest request);
}
