package djh.spring.core.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${user.game}")
	private String game;
	
	@Value("${user.team}")
	private String team;

	public String getGame() {
		return game;
	}

	public String getTeam() {
		return team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService; 
	
	public SwimCoach(FortuneService happyFortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim atleast for 2 hrs daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
