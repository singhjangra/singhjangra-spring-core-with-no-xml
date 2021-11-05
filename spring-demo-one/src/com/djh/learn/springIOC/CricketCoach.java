package com.djh.learn.springIOC;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		super();
		System.out.println("Inside CricketCoach default constructor ");
		
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside CricketCoach setter method ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Daily practice bowling 20 overs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//init-method for spring lifecycle
	
	public void doMyInitStuff() {
		System.out.println("Calling the doMyInitStuff method for spring-----------------");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("Calling the doMyDestroyStuff method for spring-----------------");
	}


}
