package ru.smartbrains.freshcrm.services;

import ru.smartbrains.freshcrm.dao.SimpleDAO;
import ru.smartbrains.freshcrm.domain.Simple;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * @author a.elkin
 *         Created 16.03.11 13:21
 */
@Stateless
public class SimpleService implements Serializable {

	private static final long serialVersionUID = -1036304210641465757L;

	@Inject
	private SimpleDAO simpleDAO;

	public String getHello() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("| id | name |\n");
		for (Simple simple : simpleDAO.getSimpleList()) {
			buffer.append("|").append(simple.getId()).append(" | ").append(simple.getName()).append("\n");
		}

		return "Hello world!\n" + buffer.toString();
	}
}
