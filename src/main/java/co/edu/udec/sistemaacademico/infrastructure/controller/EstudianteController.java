package co.edu.udec.sistemaacademico.infrastructure.controller;
import co.edu.udec.sistemaacademico.application.dto.ListarControlesGrupoResponse;
import co.edu.udec.sistemaacademico.application.usecase.ListarControlesGrupoUseCase;

import co.edu.udec.sistemaacademico.application.dto.AlumnosSobrePromedioResponse;
import co.edu.udec.sistemaacademico.application.usecase.AlumnosSobrePromedioUseCase;
import co.edu.udec.sistemaacademico.application.dto.ObtenerPromedioGrupoResponse;
import co.edu.udec.sistemaacademico.application.usecase.ObtenerPromedioGrupoUseCase;

import co.edu.udec.sistemaacademico.application.dto.ListarControlesAlumnoResponse;
import co.edu.udec.sistemaacademico.application.usecase.ListarControlesAlumnoUseCase;

import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoResponse;
import co.edu.udec.sistemaacademico.application.usecase.RegistrarControlEscritoUseCase;

import co.edu.udec.sistemaacademico.application.dto.ObtenerNotaControlResponse;
import co.edu.udec.sistemaacademico.application.usecase.ObtenerNotaControlUseCase;

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
    private final ObtenerNotaControlUseCase obtenerNotaControlUseCase;
    private final RegistrarControlEscritoUseCase registrarControlEscritoUseCase;
    private final ListarControlesAlumnoUseCase listarControlesAlumnoUseCase;
    private final ObtenerPromedioGrupoUseCase obtenerPromedioGrupoUseCase;
    private final ListarControlesGrupoUseCase listarControlesGrupoUseCase;
    private final AlumnosSobrePromedioUseCase alumnosSobrePromedioUseCase;
    private final ActualizarEstudianteUseCase actualizarUseCase;
    private final EliminarEstudianteUseCase eliminarUseCase;

    public EstudianteController(
            RegistrarEstudianteUseCase registrarUseCase,
            BuscarEstudianteUseCase buscarUseCase,
            ListarEstudiantesUseCase listarUseCase,
            ActualizarEstudianteUseCase actualizarUseCase,
            EliminarEstudianteUseCase eliminarUseCase,
            ObtenerNotaControlUseCase obtenerNotaControlUseCase,
            ListarControlesAlumnoUseCase listarControlesAlumnoUseCase,
            ObtenerPromedioGrupoUseCase obtenerPromedioGrupoUseCase,
            RegistrarControlEscritoUseCase registrarControlEscritoUseCase,
            ListarControlesGrupoUseCase listarControlesGrupoUseCase,
            AlumnosSobrePromedioUseCase alumnosSobrePromedioUseCase) {

        this.registrarUseCase = registrarUseCase;
        this.buscarUseCase = buscarUseCase;
        this.listarUseCase = listarUseCase;
        this.obtenerNotaControlUseCase =
                obtenerNotaControlUseCase;
        this.registrarControlEscritoUseCase =
                registrarControlEscritoUseCase;
        this.listarControlesAlumnoUseCase =
                listarControlesAlumnoUseCase;
        this.obtenerPromedioGrupoUseCase =
                obtenerPromedioGrupoUseCase;
        this.listarControlesGrupoUseCase =
                listarControlesGrupoUseCase;

        this.alumnosSobrePromedioUseCase =
                alumnosSobrePromedioUseCase;
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
    public List<ListarControlesGrupoResponse>
    listarControlesGrupo(
            String grupo) {

        return listarControlesGrupoUseCase.ejecutar(
                grupo
        );
    }
    public List<AlumnosSobrePromedioResponse>
    alumnosSobrePromedio() {

        return alumnosSobrePromedioUseCase.ejecutar();
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
    public ObtenerNotaControlResponse obtenerNota(
            String idControl,
            String matriculaAlumno) {

        return obtenerNotaControlUseCase.ejecutar(
                idControl,
                matriculaAlumno
        );
    }

    public RegistrarControlEscritoResponse registrarControl(
            RegistrarControlEscritoRequest request) {

        return registrarControlEscritoUseCase.ejecutar(
                request
        );
    }

    public List<ListarControlesAlumnoResponse>
    listarControlesAlumno(
            String matriculaAlumno) {

        return listarControlesAlumnoUseCase.ejecutar(
                matriculaAlumno
        );
    }

    public ObtenerPromedioGrupoResponse
    obtenerPromedioGrupo(
            String grupo) {

        return obtenerPromedioGrupoUseCase.ejecutar(
                grupo
        );
    }

}