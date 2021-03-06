package com.openwebinars.ciclodevida.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans_interfaces.xml");
		
		ClientesServicio cs = (ClientesServicio) appContext.getBean("clienteservicio");
		
		System.out.println(cs.getMensaje());
		
		((ConfigurableApplicationContext) appContext).close();
    }
}
