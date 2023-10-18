package com.example.crud;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API DE ALUNOS by: JENIFER PLÁCIDO", version = "1", description = "API desenvolvida para cadastro de alunos"))
public class CrudAlunosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudAlunosApplication.class, args);
    }

}
