package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ListarEstudianteResponse;

import java.util.List;

public interface ListarEstudiantesUseCase {

    List<ListarEstudianteResponse> ejecutar();
}
