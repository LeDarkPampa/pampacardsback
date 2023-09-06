package com.pampacards.back.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

@SpringBootApplication
@Controller
public class BackendApplication  extends SpringBootServletInitializer {

	private final DataSource dataSource;

	@Autowired
	public BackendApplication(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/database")
	String database(Map<String, Object> model) {
		try (Connection connection = dataSource.getConnection()) {
			final var statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
			statement.executeUpdate("INSERT INTO ticks VALUES (now())");

			final var resultSet = statement.executeQuery("SELECT tick FROM ticks");
			final var output = new ArrayList<>();
			while (resultSet.next()) {
				output.add("Read from DB: " + resultSet.getTimestamp("tick"));
			}

			model.put("records", output);
			return "database";

		} catch (Throwable t) {
			model.put("message", t.getMessage());
			return "error";
		}
	}

	@GetMapping("/testmap")
	String testmap(Map<String, Object> model) {
		final var output = new ArrayList<>();
		output.add("Read from DB: test1");
		output.add("Read from DB: test2");
		output.add("Read from DB: test3");

		model.put("records", output);
		return "database";
	}

	@RequestMapping("/hello")
	String hello(Map<String, Object> model) {
		model.put("pampaValue", "Valeur test");
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
