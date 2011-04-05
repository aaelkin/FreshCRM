package ru.smartbrains.freshcrm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author a.elkin
 *         Created 25.03.11 17:08
 */
@Entity
public class MetaEntity extends AbstractEntity {

	@Id
	@GeneratedValue
	protected Long id;

	private String name;

	private String tableName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
