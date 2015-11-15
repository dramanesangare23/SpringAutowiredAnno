package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");
		
		textEditor.spellCheck();
		
		((AbstractApplicationContext)applicationContext).close();
	}

}
