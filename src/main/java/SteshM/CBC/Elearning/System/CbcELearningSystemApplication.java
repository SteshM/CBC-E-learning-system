package SteshM.CBC.Elearning.System;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@ComponentScan
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class CbcELearningSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbcELearningSystemApplication.class, args);
	}

}
