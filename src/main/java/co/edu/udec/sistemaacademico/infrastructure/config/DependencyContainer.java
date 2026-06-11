package co.edu.udec.sistemaacademico.infrastructure.config;

import co.edu.udec.sistemaacademico.application.usecase.ListarControlesGrupoUseCase;
import co.edu.udec.sistemaacademico.application.usecase.ListarControlesGrupoUseCaseImpl;

import co.edu.udec.sistemaacademico.application.usecase.AlumnosSobrePromedioUseCase;
import co.edu.udec.sistemaacademico.application.usecase.AlumnosSobrePromedioUseCaseImpl;
import co.edu.udec.sistemaacademico.application.dto.ObtenerPromedioGrupoResponse;
import co.edu.udec.sistemaacademico.application.usecase.ObtenerPromedioGrupoUseCase;
import co.edu.udec.sistemaacademico.application.usecase.ObtenerPromedioGrupoUseCaseImpl;

import co.edu.udec.sistemaacademico.application.usecase.ListarControlesAlumnoUseCase;
import co.edu.udec.sistemaacademico.application.usecase.ListarControlesAlumnoUseCaseImpl;

import co.edu.udec.sistemaacademico.application.usecase.RegistrarControlEscritoUseCase;
import co.edu.udec.sistemaacademico.application.usecase.RegistrarControlEscritoUseCaseImpl;

import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.application.usecase.ObtenerNotaControlUseCase;
import co.edu.udec.sistemaacademico.application.usecase.ObtenerNotaControlUseCaseImpl;
import co.edu.udec.sistemaacademico.infrastructure.repository.InMemoryControlEscritoRepository;

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
    private final ControlEscritoRepository controlRepository;
    private final ObtenerNotaControlUseCase obtenerNotaControlUseCase;
    private final RegistrarControlEscritoUseCase registrarControlEscritoUseCase;
    private final ListarControlesAlumnoUseCase listarControlesAlumnoUseCase;
    private final ObtenerPromedioGrupoUseCase obtenerPromedioGrupoUseCase;
    private final RegistrarEstudianteUseCase registrarUseCase;
    private final BuscarEstudianteUseCase buscarUseCase;
    private final ListarEstudiantesUseCase listarUseCase;
    private final ListarControlesGrupoUseCase listarControlesGrupoUseCase;
    private final AlumnosSobrePromedioUseCase alumnosSobrePromedioUseCase;
    private final ActualizarEstudianteUseCase actualizarUseCase;
    private final EliminarEstudianteUseCase eliminarUseCase;

    private final EstudianteController controller;

    public DependencyContainer() {

        this.repository =
                new InMemoryEstudianteRepository();

        this.controlRepository =
                new InMemoryControlEscritoRepository();

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

        this.listarControlesGrupoUseCase =
                new ListarControlesGrupoUseCaseImpl(
                        controlRepository,
                        repository
                );

        this.alumnosSobrePromedioUseCase =
                new AlumnosSobrePromedioUseCaseImpl(
                        controlRepository,
                        repository
                );

        this.obtenerNotaControlUseCase =
                new ObtenerNotaControlUseCaseImpl(
                        controlRepository
                );

        this.registrarControlEscritoUseCase =
                new RegistrarControlEscritoUseCaseImpl(
                        controlRepository
                );

        this.listarControlesAlumnoUseCase =
                new ListarControlesAlumnoUseCaseImpl(
                        controlRepository
                );

        this.obtenerPromedioGrupoUseCase =
                new ObtenerPromedioGrupoUseCaseImpl(
                        controlRepository,
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
                        eliminarUseCase,
                        obtenerNotaControlUseCase,
                        listarControlesAlumnoUseCase,
                        obtenerPromedioGrupoUseCase,
                        registrarControlEscritoUseCase,
                        listarControlesGrupoUseCase,
                        alumnosSobrePromedioUseCase
                );
    }

    public EstudianteController estudianteController() {
        return controller;
    }
}
