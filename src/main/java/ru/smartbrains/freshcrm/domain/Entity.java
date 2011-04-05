package ru.smartbrains.freshcrm.domain;

import java.io.Serializable;

/**
 * @author a.elkin
 *         Created 01.04.11 12:09
 */
public interface Entity<T extends Serializable> {

	T getId();

	void setId(T id);

}
