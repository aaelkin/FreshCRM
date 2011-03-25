package ru.smartbrains.freshcrm.dao;

import ru.smartbrains.freshcrm.domain.Simple;
import ru.smartbrains.freshcrm.util.JDBCUtil;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Alexey Elkin <elkin.alexey@gmail.com>
 * Date: 20.03.11
 */
@Named
@ApplicationScoped
public class SimpleDAO {

	@PersistenceContext
	private EntityManager em;

	@Inject
	private JDBCUtil jdbcUtil;

	public List<Simple> getSimpleList() {
		return em.createQuery("from Simple").getResultList();
	}

	public List<Simple> getSimpleListWithJDBC() {
		List<Simple> simpleList = new ArrayList<Simple>();
		try {
			Connection connection = jdbcUtil.getConnection();
			Statement statement = connection.createStatement();

			statement.execute("select s.id as id, s.name as name from simple s");
			ResultSet rs = statement.getResultSet();
			while (rs.next()) {
				Simple entity = new Simple();
				entity.setId(rs.getLong("id"));
				entity.setName(rs.getString("name"));
				simpleList.add(entity);
			}
			rs.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return simpleList;
	}

}
