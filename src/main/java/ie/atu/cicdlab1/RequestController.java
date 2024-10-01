package ie.atu.cicdlab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/message")
        public String getMessage() { return "Some Message";}
    @GetMapping("/details")
        public String getDetails(){ return "Some other message";}

    @GetMapping("/greet/{name}")
        public String greetByName(@PathVariable String name) {
            return "Hello, " + name + "!";
    }

}
