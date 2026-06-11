package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ObtenerNotaControlResponse;

public interface ObtenerNotaControlUseCase {

    ObtenerNotaControlResponse ejecutar(
            String idControl,
            String matriculaAlumno
    );
}
