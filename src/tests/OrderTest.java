package tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorials.PrintResult;

public class OrderTest {

	
		 
		@SuppressWarnings("resource")
		public static void main(String[] args) {
	 
			// Load Spring ApplicationContext file beanspsr.xml
			ApplicationContext context = new ClassPathXmlApplicationContext("beanspsr.xml");
			
			// get the bean which we specified in file beanspsr.xml file
			PrintResult results = (PrintResult) context.getBean("orders");
			
			// After loading each class - just print result
			System.out.println(results);
		}
	
	
}
