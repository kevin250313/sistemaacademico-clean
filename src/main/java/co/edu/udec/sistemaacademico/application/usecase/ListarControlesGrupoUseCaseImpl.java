package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ListarControlesGrupoResponse;
import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class ListarControlesGrupoUseCaseImpl
        implements ListarControlesGrupoUseCase {

    private final ControlEscritoRepository controlRepository;
    private final EstudianteRepository estudianteRepository;

    public ListarControlesGrupoUseCaseImpl(
            ControlEscritoRepository controlRepository,
            EstudianteRepository estudianteRepository) {

        this.controlRepository = controlRepository;
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<ListarControlesGrupoResponse> ejecutar(
            String grupo) {

        List<ListarControlesGrupoResponse> resultado =
                new ArrayList<>();

        for (ControlEscrito control :
                controlRepository.listarTodos()) {

            Estudiante estudiante =
                    estudianteRepository.buscarPorMatricula(
                            control.getMatriculaAlumno()
                    );

            if (estudiante != null &&
                    estudiante.getGrupo().equals(grupo)) {

                resultado.add(
                        new ListarControlesGrupoResponse(
                                control.getIdControl(),
                                estudiante.getMatricula().value(),
                                estudiante.getNombre(),
                                estudiante.getGrupo(),
                                control.getNota()
                        )
                );
            }
        }

        return resultado;
    }
}
