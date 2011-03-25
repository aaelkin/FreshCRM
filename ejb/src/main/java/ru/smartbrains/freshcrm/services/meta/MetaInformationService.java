package ru.smartbrains.freshcrm.services.meta;

import ru.smartbrains.freshcrm.domain.MetaEntity;

import java.util.List;

/**
 * @author a.elkin
 *         Created 25.03.11 17:13
 */
public interface MetaInformationService {

	void saveMetaEntity(MetaEntity entity);

	List<MetaEntity> getMetaEntityList();


}
