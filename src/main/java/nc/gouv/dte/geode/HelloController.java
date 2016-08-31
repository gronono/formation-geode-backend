package nc.gouv.dte.geode;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

	@RequestMapping(path="/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		return "hello " + name;
	}
}
