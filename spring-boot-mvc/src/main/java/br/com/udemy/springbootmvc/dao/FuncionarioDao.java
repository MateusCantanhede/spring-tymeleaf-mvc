package br.com.udemy.springbootmvc.dao;

import java.util.List;

import br.com.udemy.springbootmvc.domain.Funcionario;

public interface FuncionarioDao {
void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
