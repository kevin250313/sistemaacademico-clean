package co.edu.udec.sistemaacademico.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;

import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

import java.util.HashMap;
import java.util.Map;

public class InMemoryEstudianteRepository
        implements EstudianteRepository {

    private final Map<String, Estudiante> estudiantes =
            new HashMap<>();

    @Override
    public void guardar(Estudiante estudiante) {

        estudiantes.put(
                estudiante.getMatricula().value(),
                estudiante
        );
    }

    @Override
    public Estudiante buscarPorMatricula(
            String matricula) {

        return estudiantes.get(matricula);
    }
    @Override
    public List<Estudiante> listarTodos() {

        return new ArrayList<>(
                estudiantes.values()
        );
    }
}
