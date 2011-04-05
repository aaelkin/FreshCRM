package ru.smartbrains.freshcrm.dao;

import ru.smartbrains.freshcrm.domain.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author a.elkin
 *         Created 01.04.11 13:19
 */
public interface DAO<T extends Entity<PK>, PK extends Serializable> {

	T getEntityById(PK id);

	List<T> getList();

	void save(T entity);
}
