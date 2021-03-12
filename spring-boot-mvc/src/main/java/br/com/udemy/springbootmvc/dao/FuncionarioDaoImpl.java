package br.com.udemy.springbootmvc.dao;

import org.springframework.stereotype.Repository;

import br.com.udemy.springbootmvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
