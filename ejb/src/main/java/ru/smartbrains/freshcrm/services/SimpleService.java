package ru.smartbrains.freshcrm.services;

import javax.ejb.Stateless;
import java.io.Serializable;

/**
 * @author a.elkin
 *         Created 16.03.11 13:21
 */
@Stateless
public class SimpleService implements Serializable {

	private static final long serialVersionUID = -1036304210641465757L;

	public String getHello() {
		return "Hello world!";
	}
}
