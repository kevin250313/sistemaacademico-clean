package co.edu.udec.sistemaacademico.application.ports;

import co.edu.udec.sistemaacademico.domain.model.Estudiante;

import java.util.List;

public interface EstudianteRepository {

    void guardar(Estudiante estudiante);

    Estudiante buscarPorMatricula(
            String matricula
    );

    List<Estudiante> listarTodos();

    void actualizar(
            Estudiante estudiante
    );

    void eliminar(
            String matricula
    );
}
