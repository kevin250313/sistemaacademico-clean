package co.edu.udec;

import co.edu.udec.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.application.dto.RegistrarEstudianteResponse;
import co.edu.udec.infrastructure.config.DependencyContainer;
import co.edu.udec.infrastructure.controller.EstudianteController;

public class Main {

    public static void main(String[] args) {

        DependencyContainer container =
                new DependencyContainer();

        EstudianteController controller =
                container.estudianteController();

        RegistrarEstudianteResponse response =
                controller.registrar(
                        new RegistrarEstudianteRequest(
                                "2025001",
                                "Kevin Gonzalez",
                                "kevin@gmail.com",
                                "5A"
                        )
                );

        System.out.println("=== ESTUDIANTE REGISTRADO ===");

        System.out.println(
                "Matricula: "
                        + response.matricula()
        );

        System.out.println(
                "Nombre: "
                        + response.nombre()
        );

        System.out.println(
                "Correo: "
                        + response.correo()
        );

        System.out.println(
                "Grupo: "
                        + response.grupo()
        );
    }
}