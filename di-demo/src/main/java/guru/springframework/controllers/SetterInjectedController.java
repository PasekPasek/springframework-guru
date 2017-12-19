package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController
{
	public GreetingService greetingService;

	public String sayHello(){
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(final GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
}
