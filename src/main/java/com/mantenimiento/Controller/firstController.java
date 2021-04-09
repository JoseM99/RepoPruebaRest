package com.mantenimiento.Controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mantenimiento.Repo.IPersonasRepo;
import com.mantenimiento.modelo.Personas;
 

@Controller
public class firstController {
	
	@Autowired
	private IPersonasRepo reposi;

	@GetMapping("/retorno")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
   
		
	Personas p = new Personas();
	p.setIdPersona(2);
	p.setNombre("Rolanda Isabel");
	p.setApellido("Gutierrez Cusipuma");
	reposi.save(p);
		
	model.addAttribute("name", name);
	return "retorno";
	
	}
	
 
	
	
 
	


}
