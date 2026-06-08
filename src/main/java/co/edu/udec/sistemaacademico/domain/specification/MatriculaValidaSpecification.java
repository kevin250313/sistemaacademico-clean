package co.edu.udec.sistemaacademico.domain.specification;

import co.edu.udec.sistemaacademico.domain.valueobjects.Matricula;

public class MatriculaValidaSpecification {

    public boolean isSatisfiedBy(Matricula matricula) {

        return matricula != null
                && matricula.value().length() >= 5;
    }
}
