package guru.springframework.controllers;

import guru.springframework.services.GreetingService;


public class SetterInjectedController
{
	public GreetingService greetingService;

	String sayHello(){
		return greetingService.sayGreeting();
	}

	public void setGreetingService(final GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
}
