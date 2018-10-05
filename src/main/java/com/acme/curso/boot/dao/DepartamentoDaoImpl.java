package com.acme.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.acme.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {
	
	//Caso seja necessário novo metodo é só criar aqui e implementat na interface

}
