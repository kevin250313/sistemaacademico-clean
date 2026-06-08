package co.edu.udec.application.ports;

import co.edu.udec.sistemaacademico.domain.model.Estudiante;

public interface EstudianteRepository {

    void guardar(Estudiante estudiante);

    Estudiante buscarPorMatricula(String matricula);
}
