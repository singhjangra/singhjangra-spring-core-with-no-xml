package djh.spring.core.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import djh.spring.core.noxml.Coach;

@Configuration
@ComponentScan("djh.spring.core")
@PropertySource("classpath:sports.properties" )
public class SpringConfigurationClass {
	
	public static void main(String[] args) {
		
		
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext(SpringConfigurationClass.class);
		  
		  SwimCoach coach = (SwimCoach) context.getBean("swimCoach",Coach.class);
		 
	
		System.out.println("-----------------"+coach.getDailyWorkOut());
		System.out.println("-----------------"+coach.getDailyFortune());
		System.out.println("-----------------"+coach.getGame() +"---"+coach.getTeam());
	}
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach coach = new SwimCoach(sadFortuneService());
		return coach;
	}
}
