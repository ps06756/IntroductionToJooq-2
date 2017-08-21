package com.jooq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.jooq.SQLDialect;
import org.jooq.DSLContext;
import org.jooq.Configuration;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DSL;
import static com.jooqGenerated.Tables.*;
import org.jooq.Record;
import org.jooq.Result;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			try ( Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost/jooq?" + 
																		"user=root&password=resnickrocks");)  {
				Configuration config = new DefaultConfiguration();
				config.set(connection);
				config.set(SQLDialect.MYSQL);
				DSLContext create = DSL.using(config);
				System.out.println(create.select(STUDENT.STUDENTNAME).from(STUDENT).where(STUDENT.STUDENTID.eq(1)).fetchOne(STUDENT.STUDENTNAME));
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
