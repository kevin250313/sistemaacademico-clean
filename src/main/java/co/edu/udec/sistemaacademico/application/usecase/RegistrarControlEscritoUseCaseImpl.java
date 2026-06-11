package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoResponse;
import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;

public class RegistrarControlEscritoUseCaseImpl
        implements RegistrarControlEscritoUseCase {

    private final ControlEscritoRepository repository;

    public RegistrarControlEscritoUseCaseImpl(
            ControlEscritoRepository repository) {

        this.repository = repository;
    }

    @Override
    public RegistrarControlEscritoResponse ejecutar(
            RegistrarControlEscritoRequest request) {

        ControlEscrito control =
                new ControlEscrito(
                        request.idControl(),
                        request.matriculaAlumno(),
                        request.nota(),
                        request.fecha()
                );

        repository.guardar(control);

        return new RegistrarControlEscritoResponse(
                control.getIdControl(),
                control.getMatriculaAlumno(),
                control.getNota(),
                control.getFecha()
        );
    }
}
