package ru.smartbrains.freshcrm.dao;

import ru.smartbrains.freshcrm.domain.Entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

/**
 * @author a.elkin
 *         Created 01.04.11 13:20
 */
public abstract class AbstractDAO<T extends Entity<PK>, PK extends Serializable> implements DAO<T, PK>, Serializable {

	protected abstract Class<T> getEntityClass();

	@PersistenceContext
	protected EntityManager em;

	@Override
	public T getEntityById(PK id) {
		return em.find(getEntityClass(), id);
	}

	@Override
	public List<T> getList() {
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(getEntityClass());
		query.from(getEntityClass());
		return em.createQuery(query).getResultList();
	}

	@Override
	public void save(T entity) {
		if (entity.getId() != null) {
			em.merge(entity);
		} else {
			em.persist(entity);
		}
	}
}
