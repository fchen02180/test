package springmvc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; 

import springmvc.service.CarManager;
 
	@Controller
	@RequestMapping("/list_cars")
	public class CarListController {

		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView helloWorld() {

			CarManager carManager = new CarManager();
			
			ModelAndView modelAndView = new ModelAndView("carList");
			modelAndView.addObject("carList", carManager.getCarList());

			return modelAndView;
		}
	} 
