package id.alterra.catalog.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import id.alterra.catalog.dto.HelloMessageResponseDTO;
import id.alterra.catalog.service.GreetingService;

@RestController
public class HelloController {

	Logger log = LoggerFactory.getLogger(HelloController.class);
	
	private GreetingService greetingService;
	
	public HelloController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	@GetMapping("/hello")
	public HelloMessageResponseDTO helloWorld() {
		log.trace("this is log TRACE");
		log.debug("this is log DEBUG");
		log.info("this is log INFO");
		log.warn("this is log WARN");
		log.error("this is log ERROR");
		HelloMessageResponseDTO dto = new HelloMessageResponseDTO();
		dto.setMessage(greetingService.sayGreeting());
		return dto;
	}
}
