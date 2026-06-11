package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ListarControlesAlumnoResponse;

import java.util.List;

public interface ListarControlesAlumnoUseCase {

    List<ListarControlesAlumnoResponse> ejecutar(
            String matriculaAlumno
    );
}