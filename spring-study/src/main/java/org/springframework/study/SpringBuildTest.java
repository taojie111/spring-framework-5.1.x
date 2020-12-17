package org.springframework.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBuildTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println(ac.getBean(JavaConfig.class));
		System.out.println("aaa");
	}
}