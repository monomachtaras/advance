package springANKUSHKORAV;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@ModelAttribute
	public void addModel(Model model1){
		model1.addAttribute("msg","oops model attribute");
	}
	
	
	@RequestMapping(value = "/admissionform.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;

	}
	
	@RequestMapping(value = "/submitadmissionform.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@ModelAttribute("student1") Student student1		) {
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;

	}
	
	
	

}
