package springANKUSHKORAV;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerAnotation {
    @RequestMapping("/welcomeannotation")
	public ModelAndView helloworld(){
		
		ModelAndView mav = new ModelAndView("HelloAnnotation");
		mav.addObject("msg", "nice annotation");
		return mav;
		
	}
	
}
