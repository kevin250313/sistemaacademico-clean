package co.edu.udec.sistemaacademico.infrastructure.controller;

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

    public EstudianteController(
            RegistrarEstudianteUseCase registrarUseCase,
            BuscarEstudianteUseCase buscarUseCase,
            ListarEstudiantesUseCase listarUseCase) {

        this.registrarUseCase = registrarUseCase;
        this.buscarUseCase = buscarUseCase;
        this.listarUseCase = listarUseCase;
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
}