package hu.me.krz.haladojava.calculatorweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import hu.me.krz.haladojava.calculatorweb.service.SzamolVS;
import szamolapi.Szamol;

@Controller
public class SzamolVez {

	@Autowired
	private SzamolVS calculationService;
	
	@GetMapping("/")
	public ModelAndView showCalc() {
		return new ModelAndView("calculator").addObject("calc", new Szamol());
	}
	
	@PostMapping("/")
	public @ResponseBody Double  calcResult(@Valid Szamol calc) {
		return calculationService.calculate(calc);
	}
	
}
