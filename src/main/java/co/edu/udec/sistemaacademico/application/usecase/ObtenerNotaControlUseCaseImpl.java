package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ObtenerNotaControlResponse;
import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;

public class ObtenerNotaControlUseCaseImpl
        implements ObtenerNotaControlUseCase {

    private final ControlEscritoRepository repository;

    public ObtenerNotaControlUseCaseImpl(
            ControlEscritoRepository repository) {

        this.repository = repository;
    }

    @Override
    public ObtenerNotaControlResponse ejecutar(
            String idControl,
            String matriculaAlumno) {

        for (ControlEscrito control :
                repository.listarTodos()) {

            if (control.getIdControl().equals(idControl)
                    && control.getMatriculaAlumno()
                    .equals(matriculaAlumno)) {

                return new ObtenerNotaControlResponse(
                        control.getIdControl(),
                        control.getMatriculaAlumno(),
                        control.getNota()
                );
            }
        }

        return null;
    }
}
