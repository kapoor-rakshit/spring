package springBOOTproj;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

//@Component                 /* REGISTER as a bean to use this class for port settings */
public class serverport implements WebServerFactoryCustomizer<ConfigurableWebServerFactory>{

	@Override
	public void customize(ConfigurableWebServerFactory factory) {
		
		factory.setPort(5000);
	}
	
}
