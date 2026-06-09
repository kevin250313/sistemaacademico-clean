package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;
import co.edu.udec.sistemaacademico.domain.valueobjects.CorreoElectronico;
import co.edu.udec.sistemaacademico.domain.valueobjects.Matricula;

public class ActualizarEstudianteUseCaseImpl
        implements ActualizarEstudianteUseCase {

    private final EstudianteRepository repository;

    public ActualizarEstudianteUseCaseImpl(
            EstudianteRepository repository) {

        this.repository = repository;
    }

    @Override
    public ActualizarEstudianteResponse ejecutar(
            ActualizarEstudianteRequest request) {

        Estudiante estudiante =
                new Estudiante(
                        new Matricula(
                                request.matricula()
                        ),
                        request.nombre(),
                        new CorreoElectronico(
                                request.correo()
                        ),
                        request.grupo()
                );

        repository.actualizar(estudiante);

        return new ActualizarEstudianteResponse(
                estudiante.getMatricula().value(),
                estudiante.getNombre(),
                estudiante.getCorreo().value(),
                estudiante.getGrupo()
        );
    }
}
