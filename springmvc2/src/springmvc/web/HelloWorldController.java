package springmvc.web;
 

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;  
 

@Controller
public class HelloWorldController {

	@RequestMapping(value="/hello_world", method = RequestMethod.GET)
	public ModelAndView helloWorld() {

		String aMessage = "Hello World MVC!";
		
		ModelAndView modelAndView = new ModelAndView("hello_world");
		modelAndView.addObject("message", aMessage);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/time", method = RequestMethod.POST)
	  public @ResponseBody String getTime(@RequestParam String name) {
	    String result = "Time for " + name + " is " + new Date().toString();
	    return result;
	  }
} 
