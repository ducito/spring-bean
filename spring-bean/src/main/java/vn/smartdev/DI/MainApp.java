package vn.smartdev.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeansDI.xml");

		/*
		 * TextEditor te = (TextEditor) context.getBean("textEditor");
		 * te.spellCheck();
		 */

		ConstructorArguments constructorArguments = (ConstructorArguments) context
				.getBean("constructorArguments");
		
	}
}
