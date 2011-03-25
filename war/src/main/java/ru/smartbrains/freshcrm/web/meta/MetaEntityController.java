package ru.smartbrains.freshcrm.web.meta;

import ru.smartbrains.freshcrm.domain.MetaEntity;
import ru.smartbrains.freshcrm.services.meta.MetaInformationService;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * @author a.elkin
 *         Created 25.03.11 17:27
 */
@Named
@RequestScoped
public class MetaEntityController implements Serializable {

	@Inject
	private MetaEntity entity;

	@EJB
	private MetaInformationService metaInformationService;

	public void create() {
		metaInformationService.saveMetaEntity(entity);
	}

	public List<MetaEntity> getEntityList() {
		return metaInformationService.getMetaEntityList();
	}

	public MetaEntity getEntity() {
		return entity;
	}

	public void setEntity(MetaEntity entity) {
		this.entity = entity;
	}
}
