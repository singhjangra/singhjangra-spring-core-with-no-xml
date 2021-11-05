package djh.spring.core.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
//@Component
//@Scope("prototype")
public class TenisCoach implements Coach {
	
	@Autowired   //field injection
	//@Qualifier("randomFortuneService")
    private FortuneService fortuneService;
  
  //For Constructor DI
	/*
	 * @Autowired public TenisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
  // For Setter DI
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
  
  
    // For Function or Method DI
	/*
	 * @Autowired public void toDoSomeCrazyStuff(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your backhand throw";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println("This method is init-method for bean class");
	}
	
	@PreDestroy
	public void doMyCleanStuff()
	{
		System.out.println("This method is destroy-method for bean class");
	}
}
