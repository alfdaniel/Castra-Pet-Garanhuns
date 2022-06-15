package br.com.socialpet.castrapetgaranhuns;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@GetMapping(value = "/api/test")
	public String test(){
		return "Tudo certo!";
	}
	
}
