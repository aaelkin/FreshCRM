package ru.smartbrains.freshcrm.util;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author a.elkin
 *         Created 25.03.11 16:33
 */
@Named
@ApplicationScoped
public class JDBCUtil implements Serializable {

	private static final long serialVersionUID = -2057993157699789599L;

	private static final String jndi = "java:/fresh-crm-ds";

	private DataSource ds;

	public Connection getConnection() throws SQLException {
		if (ds == null) {
			try {
				InitialContext ctx = new InitialContext();
				ds = (DataSource) ctx.lookup(jndi);
			} catch (NamingException e) {
				throw new RuntimeException(e);
			}
		}
		return ds.getConnection();
	}


}
