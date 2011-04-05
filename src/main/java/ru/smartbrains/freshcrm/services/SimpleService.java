package ru.smartbrains.freshcrm.services;

import ru.smartbrains.freshcrm.dao.SimpleDAO;
import ru.smartbrains.freshcrm.domain.Simple;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

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
		printList(buffer, simpleDAO.getSimpleList());
		buffer.append("<br/>");
		buffer.append("<br/>");
		printList(buffer, simpleDAO.getSimpleListWithJDBC());
		return "Hello world!\n" + buffer.toString();
	}

	private void printList(StringBuffer buffer, List<Simple> list) {
		buffer.append("| id | name |<br/>");
		for (Simple simple : list) {
			buffer.append("|").append(simple.getId()).append(" | ").append(simple.getName()).append("<br/>");
		}
	}
}
