package springproj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class drawingapp {

	public static void main(String[] args) {
		
	//triangle triangle = new triangle();                                                 // WITHOUT USING SPRING
		
	BeanFactory factory  = new XmlBeanFactory(new FileSystemResource("spring.xml"));      // USING SPRING
		
	triangle.draw();

	}

}
