package sky.project.skyproject1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${who.am.i}")
	private String whoAmI;
	
	@GetMapping("/whoami")
	public String whoami() {
		return whoAmI;
	}

}
