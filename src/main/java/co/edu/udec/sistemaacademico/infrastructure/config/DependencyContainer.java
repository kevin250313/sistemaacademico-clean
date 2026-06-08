package co.edu.udec.infrastructure.config;

import co.edu.udec.application.ports.EstudianteRepository;
import co.edu.udec.application.usecase.RegistrarEstudianteUseCase;
import co.edu.udec.application.usecase.RegistrarEstudianteUseCaseImpl;
import co.edu.udec.infrastructure.controller.EstudianteController;
import co.edu.udec.infrastructure.repository.InMemoryEstudianteRepository;

public class DependencyContainer {

    private final EstudianteRepository repository;
    private final RegistrarEstudianteUseCase registrarUseCase;
    private final EstudianteController controller;

    public DependencyContainer() {

        this.repository =
                new InMemoryEstudianteRepository();

        this.registrarUseCase =
                new RegistrarEstudianteUseCaseImpl(
                        repository
                );

        this.controller =
                new EstudianteController(
                        registrarUseCase
                );
    }

    public EstudianteController estudianteController() {
        return controller;
    }
}
