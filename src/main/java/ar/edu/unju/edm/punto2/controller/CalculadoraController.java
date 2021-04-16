package ar.edu.unju.edm.punto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.punto2.model.Calculadora;



@Controller
public class CalculadoraController {
	
	@Autowired
	Calculadora unaCalculadora;
	
	@GetMapping ("/calculadora")
	public String getMenuCalculadora() {
		return("calculadora");
	}
	
	@GetMapping ("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "a") String a , @RequestParam (name = "b") int b) {
		
		unaCalculadora.setA(Integer.valueOf(a)); 
		unaCalculadora.setB(b); 
		
		int resultadoSuma=unaCalculadora.sumar(); 
		
		ModelAndView modelView = new ModelAndView("resultado"); 
		modelView.addObject("resultadoSuma", resultadoSuma); 
		
		return modelView; 
	}
	
	@GetMapping ("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "a") int a , @RequestParam (name = "b") int b) {
		
		unaCalculadora.setA(a); 
		unaCalculadora.setB(b); 
		
		int resultadoResta=unaCalculadora.restar(); 
		
		ModelAndView modelView = new ModelAndView("resultado"); 
		modelView.addObject("resultadoResta", resultadoResta); 
		
		return modelView; 
	}
	
	@GetMapping ("/calculoProducto")
	public ModelAndView getCalculoProducto(@RequestParam (name = "a") int a , @RequestParam (name = "b") int b) {
		
		unaCalculadora.setA(a);
		unaCalculadora.setB(b); 
		
		int resultadoProducto=unaCalculadora.multiplicar(); 
		
		ModelAndView modelView = new ModelAndView("resultado"); 
		modelView.addObject("resultadoProducto", resultadoProducto); 
		
		return modelView; 
	}
	
	@GetMapping ("/calculoDivision")
	public ModelAndView getCalculoDivision(@RequestParam (name = "a") String a , @RequestParam (name = "b") int b) {
		
		unaCalculadora.setA(Integer.valueOf(a)); 
		unaCalculadora.setB(b); 
		
		int resultadoDivision=unaCalculadora.dividir(); 
		
		ModelAndView modelView = new ModelAndView("resultado"); 
		modelView.addObject("resultadoDivision", resultadoDivision); 
		
		return modelView; 
	}
}