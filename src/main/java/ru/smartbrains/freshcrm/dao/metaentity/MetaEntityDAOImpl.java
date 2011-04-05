package ru.smartbrains.freshcrm.dao.metaentity;

import ru.smartbrains.freshcrm.domain.MetaEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author a.elkin
 *         Created 25.03.11 17:12
 */
@Named
@ApplicationScoped
public class MetaEntityDAOImpl extends MetaEntityDAO {

	@Override
	protected Class<MetaEntity> getEntityClass() {
		return MetaEntity.class;
	}
}
