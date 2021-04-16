package ar.edu.unju.edm.punto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.punto1.model.Provincia;

@Controller
public class ProvinciaController {
	@Autowired
	Provincia unaProvincia;
	
	@GetMapping({"/provincias"})
	public String cargarProvincia(Model model) {
		unaProvincia.setNombre("Tucuman");
		model.addAttribute("prov", unaProvincia);
		return "provincias";
	}
}
