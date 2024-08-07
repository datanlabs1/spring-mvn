package com.datanlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.datanlabs")
public class SpringbootMavenCourseMicroSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenCourseMicroSvcApplication.class, args);
	}

}
