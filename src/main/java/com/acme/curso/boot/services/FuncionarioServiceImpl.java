package com.acme.curso.boot.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.curso.boot.dao.FuncionarioDao;
import com.acme.curso.boot.domain.Funcionario;

@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;
	
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public List<Funcionario> buscarPorNome(String nome) {

		return dao.findByNome(nome);
	}

	@Override
	public List<Funcionario> buscarPorCargo(Long id) {
		return dao.findByCargo(id);
	}

	@Override
	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
		if (entrada != null && saida != null) {
			return dao.findByDataEntradaDataSaida(entrada, saida);
		} else if (entrada != null) {
			return dao.findByDataEntrada(entrada);
		} else if (saida != null) {
			return dao.findByDataSaida(saida);
		} else {
			return new ArrayList<>();
		}
		
	}

}
