package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String args[]) {

        Resource resource = new ClassPathResource("resources/spring.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        System.out.println("\nAll configuration is loaded.. XML Document is valid...\n");

        beanFactory.getBean("t");
        beanFactory.getBean("t");
        beanFactory.getBean("t");

    }

}
