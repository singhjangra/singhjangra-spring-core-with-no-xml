package com.djh.learn.springIOC;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log log = LogFactory.getLog(HelloSpringApp.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = (CricketCoach) context.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWorkOut());
		log.info("-----------------"+coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		context.close();
	}

}
