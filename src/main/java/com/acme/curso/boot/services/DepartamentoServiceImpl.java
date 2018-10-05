package com.acme.curso.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.curso.boot.dao.DepartamentoDao;
import com.acme.curso.boot.domain.Departamento;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	public void editar(Departamento departamento) {
		// TODO Auto-generated method stub
		dao.update(departamento);
		
	}

	public void excluir(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
