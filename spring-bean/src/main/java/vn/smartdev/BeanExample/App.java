package vn.smartdev.BeanExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		/*HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();
		Singleton singletonA = (Singleton) context.getBean("singleton");
		singletonA.setMessage("Duc");

		Singleton singletonB = (Singleton) context.getBean("singleton");

		singletonA.getMessage();
		singletonB.getMessage();
		//====================
		Prototype prototypeA = (Prototype) context.getBean("prototype");
		prototypeA.setMessage("Hai");

		Prototype prototypeB = (Prototype) context.getBean("prototype");

		prototypeA.getMessage();
		prototypeB.getMessage();
		//====================
		
		
		LifeCycle lifeCycle = (LifeCycle) context.getBean("lifeCycle");
		lifeCycle.getMessage();
		context.registerShutdownHook();
		//====================
		
		Hello obj = (Hello) context.getBean("hello");
	    obj.getMessage();
	    //context.registerShutdownHook();
		//====================
		  
		  */
		HelloVietnam helloVietnam = (HelloVietnam) context.getBean("helloVietnam");
		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
		
		helloVietnam.getMessage1();
		helloVietnam.getMessage2();
		helloIndia.getMessage1();
		helloIndia.getMessage3();
	}
}
