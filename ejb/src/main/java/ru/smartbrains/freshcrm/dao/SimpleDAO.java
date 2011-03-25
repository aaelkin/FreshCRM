package ru.smartbrains.freshcrm.dao;

import ru.smartbrains.freshcrm.domain.Simple;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * User: Alexey Elkin <elkin.alexey@gmail.com>
 * Date: 20.03.11
 */
@Named
@ApplicationScoped
public class SimpleDAO {

	@PersistenceContext
	private EntityManager em;

	public List<Simple> getSimpleList() {
		return em.createQuery("from Simple").getResultList();
	}

}
