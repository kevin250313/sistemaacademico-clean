package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ListarControlesAlumnoResponse;
import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;

import java.util.ArrayList;
import java.util.List;

public class ListarControlesAlumnoUseCaseImpl
        implements ListarControlesAlumnoUseCase {

    private final ControlEscritoRepository repository;

    public ListarControlesAlumnoUseCaseImpl(
            ControlEscritoRepository repository) {

        this.repository = repository;
    }

    @Override
    public List<ListarControlesAlumnoResponse> ejecutar(
            String matriculaAlumno) {

        List<ListarControlesAlumnoResponse> resultado =
                new ArrayList<>();

        for (ControlEscrito control :
                repository.listarTodos()) {

            if (control.getMatriculaAlumno()
                    .equals(matriculaAlumno)) {

                resultado.add(
                        new ListarControlesAlumnoResponse(
                                control.getIdControl(),
                                control.getMatriculaAlumno(),
                                control.getNota(),
                                control.getFecha()
                        )
                );
            }
        }

        return resultado;
    }
}