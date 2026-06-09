package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.BuscarEstudianteResponse;

public interface BuscarEstudianteUseCase {

    BuscarEstudianteResponse ejecutar(
            String matricula
    );
}
