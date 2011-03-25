package ru.smartbrains.freshcrm.services.meta;

import ru.smartbrains.freshcrm.dao.metaentity.MetaEntityDAO;
import ru.smartbrains.freshcrm.domain.MetaEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * @author a.elkin
 *         Created 25.03.11 17:14
 */
@Stateless
public class MetaInformationServiceImpl implements MetaInformationService {

	@Inject
	private MetaEntityDAO metaEntityDAO;

	@Override
	public void saveMetaEntity(MetaEntity entity) {
		metaEntityDAO.save(entity);
	}

	@Override
	public List<MetaEntity> getMetaEntityList() {
		return metaEntityDAO.getList();
	}
}
