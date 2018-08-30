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
		app.setDefaultProperties(Collections.singletonMap("server.port", "5000"));
		
		app.run(args);
		
	}

}
