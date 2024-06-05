package com.kimikevin.shopa;

import com.kimikevin.shopa.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class ShopaApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ShopaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * from PRODUCT";

		List<Product> products = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Product.class));

		products.forEach(System.out::println);
	}
}
