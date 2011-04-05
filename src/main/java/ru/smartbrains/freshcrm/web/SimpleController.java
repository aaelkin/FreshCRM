package ru.smartbrains.freshcrm.web;

import org.jboss.seam.servlet.http.DefaultValue;
import org.jboss.seam.servlet.http.RequestParam;
import ru.smartbrains.freshcrm.services.SimpleService;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
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

	@Inject
	@RequestParam
	@DefaultValue("75")
	private String id;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
