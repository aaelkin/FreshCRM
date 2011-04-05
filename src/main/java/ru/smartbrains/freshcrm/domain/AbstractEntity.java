package ru.smartbrains.freshcrm.domain;

import java.io.Serializable;

/**
 * @author a.elkin
 *         Created 01.04.11 12:11
 */
public abstract class AbstractEntity implements Entity<Long>, Serializable {

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof AbstractEntity)) return false;

		AbstractEntity that = (AbstractEntity) o;

		if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return getId() != null ? getId().hashCode() : 0;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "{" +
				"id=" + getId() +
				'}';
	}
}
