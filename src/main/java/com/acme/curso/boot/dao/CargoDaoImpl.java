package com.acme.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.acme.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
