package ru.smartbrains.freshcrm.dao.metaentity;

import ru.smartbrains.freshcrm.domain.MetaEntity;

import java.util.List;

/**
 * @author a.elkin
 *         Created 25.03.11 17:12
 */
public interface MetaEntityDAO {

	List<MetaEntity> getList();

	void save(MetaEntity entity);
}
