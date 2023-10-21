package com.example.crud.controller;


import com.example.crud.model.Aluno;
import com.example.crud.service.AlunoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Operation(summary = "Listar Alunos", description = "Retorna a lista de todos os alunos")
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @Operation(summary = "Obter Aluno por ID", description = "Retorna um aluno pelo ID")
    @GetMapping("/{id}")
    public Optional<Aluno> encontrarAluno(@PathVariable Long id) {
        return alunoService.encontrarAlunoPorId(id);
    }

    @Operation(summary = "Realiza o cadastro de um aluno", description = "Realiza o cadastro de um novo aluno")
    @PostMapping
    public Aluno adicionarAluno(@RequestBody Aluno aluno) {
        return alunoService.adicionarAluno(aluno);
    }

    @Operation(summary = "Atualizar Alunos", description = "Atualiza o registro de um aluno pelo id")
    @PutMapping("/{id}")
    public Aluno editarAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.editarAluno(id, aluno);
    }

    @Operation(summary = "Deletar Alunos", description = "Deleta um aluno pelo id")
    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }
}
