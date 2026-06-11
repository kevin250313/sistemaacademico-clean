package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ObtenerPromedioGrupoResponse;

public interface ObtenerPromedioGrupoUseCase {

    ObtenerPromedioGrupoResponse ejecutar(
            String grupo
    );
}
