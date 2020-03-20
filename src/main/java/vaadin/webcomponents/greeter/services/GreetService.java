package vaadin.webcomponents.greeter.services;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

/**
 *	dummy service call 
 */
@Service
@Log4j2
public class GreetService {

    public String greet(String name) {
        var message = createMessage(name);
        log.info("Greeting: " + message);
		return message;
    }

	private String createMessage(String name) {
		if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
	}

}
