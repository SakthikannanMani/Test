package com.ETBlacklist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication(
	    scanBasePackages = {"com.ETBlacklist", "com.JKSShedular"},
	    exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class}
	)

@EnableScheduling
public class Application  {


	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		System.out.println("Appliction Started");

	}
}