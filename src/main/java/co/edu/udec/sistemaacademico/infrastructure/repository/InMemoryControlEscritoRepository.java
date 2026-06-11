package co.edu.udec.sistemaacademico.infrastructure.repository;

import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;

import java.util.ArrayList;
import java.util.List;

public class InMemoryControlEscritoRepository
        implements ControlEscritoRepository {

    private final List<ControlEscrito> controles =
            new ArrayList<>();

    @Override
    public void guardar(
            ControlEscrito control) {

        controles.add(control);
    }

    @Override
    public List<ControlEscrito> listarTodos() {

        return controles;
    }
}