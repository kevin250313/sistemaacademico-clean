package co.edu.udec.sistemaacademico.infrastructure.config;

import co.edu.udec.sistemaacademico.application.usecase.EliminarEstudianteUseCase;
import co.edu.udec.sistemaacademico.application.usecase.EliminarEstudianteUseCaseImpl;

import co.edu.udec.sistemaacademico.application.usecase.ActualizarEstudianteUseCase;
import co.edu.udec.sistemaacademico.application.usecase.ActualizarEstudianteUseCaseImpl;

import co.edu.udec.sistemaacademico.application.usecase.ListarEstudiantesUseCase;
import co.edu.udec.sistemaacademico.application.usecase.ListarEstudiantesUseCaseImpl;

import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;

import co.edu.udec.sistemaacademico.application.usecase.BuscarEstudianteUseCase;
import co.edu.udec.sistemaacademico.application.usecase.BuscarEstudianteUseCaseImpl;

import co.edu.udec.sistemaacademico.application.usecase.RegistrarEstudianteUseCase;
import co.edu.udec.sistemaacademico.application.usecase.RegistrarEstudianteUseCaseImpl;
import co.edu.udec.sistemaacademico.infrastructure.controller.EstudianteController;
import co.edu.udec.sistemaacademico.infrastructure.repository.InMemoryEstudianteRepository;

public class DependencyContainer {

    private final EstudianteRepository repository;
    private final RegistrarEstudianteUseCase registrarUseCase;
    private final BuscarEstudianteUseCase buscarUseCase;
    private final ListarEstudiantesUseCase listarUseCase;
    private final ActualizarEstudianteUseCase actualizarUseCase;
    private final EliminarEstudianteUseCase eliminarUseCase;
    private final EstudianteController controller;

    public DependencyContainer() {

        this.repository =
                new InMemoryEstudianteRepository();

        this.registrarUseCase =
                new RegistrarEstudianteUseCaseImpl(
                        repository
                );

        this.buscarUseCase =
                new BuscarEstudianteUseCaseImpl(
                        repository
                );

        this.listarUseCase =
                new ListarEstudiantesUseCaseImpl(
                        repository
                );

        this.actualizarUseCase =
                new ActualizarEstudianteUseCaseImpl(
                        repository
                );

        this.eliminarUseCase =
                new EliminarEstudianteUseCaseImpl(
                        repository
                );

        this.controller =
                new EstudianteController(
                        registrarUseCase,
                        buscarUseCase,
                        listarUseCase,
                        actualizarUseCase,
                        eliminarUseCase
                );
    }

    public EstudianteController estudianteController() {
        return controller;
    }
}
