package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.factory.EstudianteFactory;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

public class RegistrarEstudianteUseCaseImpl
        implements RegistrarEstudianteUseCase {

    private final EstudianteRepository repository;

    public RegistrarEstudianteUseCaseImpl(
            EstudianteRepository repository) {

        this.repository = repository;
    }

    @Override
    public RegistrarEstudianteResponse ejecutar(
            RegistrarEstudianteRequest request) {

        Estudiante estudiante =
                EstudianteFactory.crear(
                        request.matricula(),
                        request.nombre(),
                        request.correo(),
                        request.grupo()
                );

        repository.guardar(estudiante);

        return new RegistrarEstudianteResponse(
                estudiante.getMatricula().value(),
                estudiante.getNombre(),
                estudiante.getCorreo().value(),
                estudiante.getGrupo()
        );
    }
}