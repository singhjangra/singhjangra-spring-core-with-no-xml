package com.djh.learn.springIOC;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	public BaseBallCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService=fortuneService;
	}

	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
