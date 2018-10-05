package com.acme.curso.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.curso.boot.dao.CargoDao;
import com.acme.curso.boot.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;

	public void salvar(Cargo cargo) {
		dao.save(cargo);

	}

	public void editar(Cargo cargo) {
		dao.update(cargo);

	}

	public void excluir(Long id) {
		dao.delete(id);

	}

	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}

}
