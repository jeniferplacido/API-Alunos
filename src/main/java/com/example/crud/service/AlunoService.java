package com.example.crud.service;

import com.example.crud.model.Aluno;
import com.example.crud.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> encontrarAlunoPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno adicionarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno editarAluno(Long id, Aluno aluno) {
        if (alunoRepository.existsById(id)) {
            aluno.setId(id);
            return alunoRepository.save(aluno);
        }
        return null;
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}


