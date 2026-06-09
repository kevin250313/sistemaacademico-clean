package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.EliminarEstudianteResponse;

public interface EliminarEstudianteUseCase {

    EliminarEstudianteResponse ejecutar(
            String matricula
    );
}
