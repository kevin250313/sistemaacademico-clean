package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ListarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

import java.util.List;

public class ListarEstudiantesUseCaseImpl
        implements ListarEstudiantesUseCase {

    private final EstudianteRepository repository;

    public ListarEstudiantesUseCaseImpl(
            EstudianteRepository repository) {

        this.repository = repository;
    }

    @Override
    public List<ListarEstudianteResponse> ejecutar() {

        return repository.listarTodos()
                .stream()
                .map(this::convertir)
                .toList();
    }

    private ListarEstudianteResponse convertir(
            Estudiante estudiante) {

        return new ListarEstudianteResponse(
                estudiante.getMatricula().value(),
                estudiante.getNombre(),
                estudiante.getCorreo().value(),
                estudiante.getGrupo()
        );
    }
}