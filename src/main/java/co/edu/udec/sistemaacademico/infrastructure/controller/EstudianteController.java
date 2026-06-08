package co.edu.udec.infrastructure.controller;

import co.edu.udec.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.application.dto.RegistrarEstudianteResponse;
import co.edu.udec.application.usecase.RegistrarEstudianteUseCase;

public class EstudianteController {

    private final RegistrarEstudianteUseCase useCase;

    public EstudianteController(
            RegistrarEstudianteUseCase useCase) {

        this.useCase = useCase;
    }

    public RegistrarEstudianteResponse registrar(
            RegistrarEstudianteRequest request) {

        return useCase.ejecutar(request);
    }
}
