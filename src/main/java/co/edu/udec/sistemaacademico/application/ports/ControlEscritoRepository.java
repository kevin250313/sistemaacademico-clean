package co.edu.udec.sistemaacademico.application.ports;

import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;

import java.util.List;

public interface ControlEscritoRepository {

    void guardar(ControlEscrito control);

    List<ControlEscrito> listarTodos();
}