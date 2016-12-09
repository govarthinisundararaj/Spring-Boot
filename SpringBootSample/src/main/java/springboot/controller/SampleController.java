package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springboot.entity.Marks;

@Controller
public class SampleController {
	
	@RequestMapping(value = "/welcome")
	public String home(){
		return "home";
	}
	
}
