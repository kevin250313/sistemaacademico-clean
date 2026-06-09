package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.EliminarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

public class EliminarEstudianteUseCaseImpl
        implements EliminarEstudianteUseCase {

    private final EstudianteRepository repository;

    public EliminarEstudianteUseCaseImpl(
            EstudianteRepository repository) {

        this.repository = repository;
    }

    @Override
    public EliminarEstudianteResponse ejecutar(
            String matricula) {

        Estudiante estudiante =
                repository.buscarPorMatricula(
                        matricula
                );

        if (estudiante == null) {

            return new EliminarEstudianteResponse(
                    "Estudiante no encontrado"
            );
        }

        repository.eliminar(matricula);

        return new EliminarEstudianteResponse(
                "Estudiante eliminado correctamente"
        );
    }
}
