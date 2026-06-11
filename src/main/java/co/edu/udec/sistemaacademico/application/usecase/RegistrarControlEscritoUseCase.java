package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoResponse;

public interface RegistrarControlEscritoUseCase {

    RegistrarControlEscritoResponse ejecutar(
            RegistrarControlEscritoRequest request
    );
}