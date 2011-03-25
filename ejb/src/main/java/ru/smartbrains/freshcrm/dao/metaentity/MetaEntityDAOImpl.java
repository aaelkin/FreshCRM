package ru.smartbrains.freshcrm.dao.metaentity;

import ru.smartbrains.freshcrm.domain.MetaEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * @author a.elkin
 *         Created 25.03.11 17:12
 */
@Named
@ApplicationScoped
public class MetaEntityDAOImpl implements MetaEntityDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<MetaEntity> getList() {
		CriteriaQuery<MetaEntity> query = em.getCriteriaBuilder().createQuery(MetaEntity.class);
		query.from(MetaEntity.class);
		return em.createQuery(query).getResultList();
	}

	@Override
	public void save(MetaEntity entity) {
		if (entity.getId() == null) {
			em.persist(entity);
		} else {
			em.merge(entity);
		}
	}
}
