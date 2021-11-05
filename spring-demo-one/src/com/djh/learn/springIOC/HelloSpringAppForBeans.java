package com.djh.learn.springIOC;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAppForBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log log = LogFactory.getLog(HelloSpringAppForBeans.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-scope-applicationContext.xml");
		Coach coach =  context.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWorkOut());
		log.info("-----------------"+coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.hashCode());
		System.out.println(coach);
		System.out.println("--------------------------------");
		Coach alphaCoach =  context.getBean("myCoach",Coach.class);
		System.out.println(alphaCoach.getDailyWorkOut());
		log.info("-----------------"+alphaCoach.getDailyWorkOut());
		System.out.println(alphaCoach.getDailyFortune());
		System.out.println(alphaCoach.hashCode());
		System.out.println(alphaCoach);
		context.close();
	}

}
