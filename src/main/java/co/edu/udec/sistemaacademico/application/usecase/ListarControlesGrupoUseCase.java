package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ListarControlesGrupoResponse;

import java.util.List;

public interface ListarControlesGrupoUseCase {

    List<ListarControlesGrupoResponse> ejecutar(
            String grupo
    );
}