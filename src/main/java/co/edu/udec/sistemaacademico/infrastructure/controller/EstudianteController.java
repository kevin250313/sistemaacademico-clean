package co.edu.udec.sistemaacademico.infrastructure.controller;

import co.edu.udec.sistemaacademico.application.dto.EliminarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.usecase.EliminarEstudianteUseCase;

import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.usecase.ActualizarEstudianteUseCase;

import co.edu.udec.sistemaacademico.application.dto.ListarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.usecase.ListarEstudiantesUseCase;

import java.util.List;

import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.usecase.BuscarEstudianteUseCase;
import co.edu.udec.sistemaacademico.application.usecase.RegistrarEstudianteUseCase;
import co.edu.udec.sistemaacademico.application.dto.BuscarEstudianteResponse;

public class EstudianteController {

    private final RegistrarEstudianteUseCase registrarUseCase;
    private final BuscarEstudianteUseCase buscarUseCase;
    private final ListarEstudiantesUseCase listarUseCase;
    private final ActualizarEstudianteUseCase actualizarUseCase;
    private final EliminarEstudianteUseCase eliminarUseCase;

    public EstudianteController(
            RegistrarEstudianteUseCase registrarUseCase,
            BuscarEstudianteUseCase buscarUseCase,
            ListarEstudiantesUseCase listarUseCase,
            ActualizarEstudianteUseCase actualizarUseCase,
            EliminarEstudianteUseCase eliminarUseCase) {

        this.registrarUseCase = registrarUseCase;
        this.buscarUseCase = buscarUseCase;
        this.listarUseCase = listarUseCase;
        this.actualizarUseCase = actualizarUseCase;
        this.eliminarUseCase = eliminarUseCase;
    }

    public RegistrarEstudianteResponse registrar(
            RegistrarEstudianteRequest request) {


        return registrarUseCase.ejecutar(request);
    }

    public BuscarEstudianteResponse buscar(
            String matricula) {

        return buscarUseCase.ejecutar(
                matricula
        );
    }

    public List<ListarEstudianteResponse> listar() {

        return listarUseCase.ejecutar();
    }

    public ActualizarEstudianteResponse actualizar(
            ActualizarEstudianteRequest request) {

        return actualizarUseCase.ejecutar(
                request
        );
    }

    public EliminarEstudianteResponse eliminar(
            String matricula) {

        return eliminarUseCase.ejecutar(
                matricula
        );
    }
}