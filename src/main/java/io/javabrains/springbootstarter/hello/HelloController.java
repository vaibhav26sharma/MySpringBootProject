package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// Below annotation tells the Spring framework that whenever a request
	// comes for url '/hello' call this method & return the string

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
