package com.samo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {
	
	@RequestMapping(value = "jspdemo.f", method = RequestMethod.GET)
    public String welcomePageForJSP(Model model) {
        model.addAttribute("message", "This is Welcome page for Java Server Pages (JSP)");
        return "indexJSP";
    }
 
 /*   @RequestMapping(value = "/jsfdemo", method = RequestMethod.GET)
    public String welcomePageForJSF(Model model) {
        model.addAttribute("message", "This is Welcome page for Java Server Faces (JSF)");
        return "indexJSF";
    }
    */
}

/*@Controller
@RequestMapping("/")
public class BaseController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("message",
				"Maven Web Project + Spring 3 MVC - welcome()");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}

	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - "
				+ name);
		return "index";

	}

}*/