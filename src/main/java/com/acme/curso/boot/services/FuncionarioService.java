package com.acme.curso.boot.services;

import java.util.List;

import com.acme.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void excluir(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

}
