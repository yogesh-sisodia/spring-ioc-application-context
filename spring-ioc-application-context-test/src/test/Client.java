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

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");

        System.out.println("\nAll configuration is loaded.. XML Document is valid...\n");

        applicationContext.getBean("t");
        applicationContext.getBean("t");
        applicationContext.getBean("t");

    }

}
