package RestfulWebServices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorld {

	//GET
	//URI -/hello-world
	//Method -//"Hello World"
	@GetMapping(path="/hello-world")
	//@RequestMapping(method = RequestMethod.GET, path="/hello-world")
	public String helloworld() {
		return "Hello World Capgemini";
	}
}
