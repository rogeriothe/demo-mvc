package com.acme.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.acme.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
