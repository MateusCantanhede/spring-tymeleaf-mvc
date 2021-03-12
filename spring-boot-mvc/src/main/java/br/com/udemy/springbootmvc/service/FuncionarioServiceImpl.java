package br.com.udemy.springbootmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.udemy.springbootmvc.dao.FuncionarioDao;
import br.com.udemy.springbootmvc.domain.Funcionario;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioDao{
	
	@Autowired 

	private FuncionarioDao dao;
	
	@Override @Transactional(readOnly = false)
	public void save(Funcionario funcionario) {
		dao.save(funcionario);
	}

	@Override @Transactional(readOnly = false)
	public void update(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Override @Transactional(readOnly = false)
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionario findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> findAll() {
		return dao.findAll();
	}
	
}
