package br.com.udemy.springbootmvc.dao;

import org.springframework.stereotype.Repository;

import br.com.udemy.springbootmvc.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
