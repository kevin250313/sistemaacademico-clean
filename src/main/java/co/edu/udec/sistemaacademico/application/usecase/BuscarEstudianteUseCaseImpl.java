package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.BuscarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

public class BuscarEstudianteUseCaseImpl
        implements BuscarEstudianteUseCase {

    private final EstudianteRepository repository;

    public BuscarEstudianteUseCaseImpl(
            EstudianteRepository repository) {

        this.repository = repository;
    }

    @Override
    public BuscarEstudianteResponse ejecutar(
            String matricula) {

        Estudiante estudiante =
                repository.buscarPorMatricula(
                        matricula
                );

        if (estudiante == null) {
            return null;
        }

        return new BuscarEstudianteResponse(
                estudiante.getMatricula().value(),
                estudiante.getNombre(),
                estudiante.getCorreo().value(),
                estudiante.getGrupo()
        );
    }
}
