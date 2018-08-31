package springBOOTproj;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class mainclass {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(mainclass.class);
		
		 /* Reference : https://www.baeldung.com/spring-boot-change-port  for changing default TOMCAT port in SPRINGBOOT */
		/* refer serverport.java file as well */
		// app.setDefaultProperties(Collections.singletonMap("server.port", "5000"));
		
		// CONFIGURE application.properties file in src/main/resources (MKDIR by me) SOURCE folder
		// for server PORT and other settings
		// for all available keys
		// https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
		
		app.run(args);
		
	}

}
