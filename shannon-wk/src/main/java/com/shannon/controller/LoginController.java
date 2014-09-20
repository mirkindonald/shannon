/**
 * 
 */
package com.shannon.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mirkin
 *
 */
@Controller
public class LoginController extends BaseController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLoginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		logger.info("Loading page...");
		String logoutSuccess = messageSource.getMessage("logout.success", null, "Default", null);
		String loginError = messageSource.getMessage("login.error", null, "Default", null);
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", loginError);
		}
		if (logout != null) {
			model.addObject("msg", logoutSuccess);
		}
		model.setViewName("home");
		return model;

	}

	@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
	public ModelAndView getWelcomePage() {
		logger.info("Loading page...");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		return model;

	}
	
	@RequestMapping(value = { "/403" }, method = RequestMethod.GET)
	public ModelAndView getAccessDenied() {
		logger.info("Loading page 403...");
		ModelAndView model = new ModelAndView();
		model.setViewName("403");
		return model;

	}
	
	public static void main(String args[]) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("password");
		logger.info(hashedPassword);
	}
}

