
package com.example.web;

import com.example.domain.Persona;
import com.example.services.PersonaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
@Slf4j
public class ContrladorInicio {
    
        @Autowired 
        private PersonaService personaService;
        
        @GetMapping("/")   
        public String inicio( Model model, @AuthenticationPrincipal User user){            
            
            Iterable<Persona> personas = personaService.listarPersonas();   
            
            log.info("ejecutando el controlador Spring MVC");                                 
            log.info("usuario que hizo login " + user);
            model.addAttribute("personas", personas);
            model.addAttribute("usuario", user);
            return "index";            
        }
        
        @GetMapping("/agregar")
        public String agregar( Persona persona){
            return "modificar";
        }
        
        @PostMapping("/guardar")
        public String guardar ( @Valid Persona persona, Errors errores){
            if(errores.hasErrors()){
            return "modificar";
        }
            personaService.guardar(persona);
            return "redirect:/";
        }
                
        @GetMapping("/editar/{idpersona}")
        public String editar(Persona persona, Model model){
            persona = personaService.encontrarPersona(persona);
            model.addAttribute("persona", persona);
            return "modificar";
        }
        
        @GetMapping("/eliminar")        
        public String eliminar(Persona persona){
            personaService.eliminar(persona);           
            return "redirect:/";
        }                
}
