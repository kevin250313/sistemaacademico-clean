package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.AlumnosSobrePromedioResponse;

import java.util.List;

public interface AlumnosSobrePromedioUseCase {

    List<AlumnosSobrePromedioResponse> ejecutar();
}