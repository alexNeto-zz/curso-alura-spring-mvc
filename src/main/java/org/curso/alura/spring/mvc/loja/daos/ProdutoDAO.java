package org.curso.alura.spring.mvc.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.curso.alura.spring.mvc.loja.models.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void gravar(Produto produto) {
		manager.persist(produto);
	}
}