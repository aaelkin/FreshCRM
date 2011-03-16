package ru.smartbrains.freshcrm.web;

import ru.smartbrains.freshcrm.services.SimpleService;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author a.elkin
 *         Created 16.03.11 18:26
 */
@Named
@RequestScoped
public class SimpleController implements Serializable {

	@EJB
	private SimpleService simpleService;

	public SimpleService getSimpleService() {
		return simpleService;
	}

	public void setSimpleService(SimpleService simpleService) {
		this.simpleService = simpleService;
	}
}
