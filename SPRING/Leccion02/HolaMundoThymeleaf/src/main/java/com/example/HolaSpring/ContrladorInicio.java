
package com.example.HolaSpring;

import com.example.HolaSpring.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
@Slf4j
public class ContrladorInicio {
        @Value("${index.saludo}")
        private String saludo;
        
        @GetMapping("/")   
        public String inicio( Model model) {            
            String mensaje = "Mensaje con Thymeleaf";
            Persona persona = new Persona();
            persona.setNombre("Juan");
            persona.setApellido("Perez");
            persona.setEmail("jperez@hotmail.com");
            persona.setTelefono("12345");
            
            Persona persona2 = new Persona();
            persona2.setNombre("Carlas");
            persona2.setApellido("Gomez");
            persona2.setEmail("cgomez@hotmail.com");
            persona2.setTelefono("55555");
            
            List<Persona> personas = new ArrayList(); 
            
            personas.add(persona);
            personas.add(persona2);
            
            /*
            var personas = Arrays.asList(persona, persona2);
            */
            log.info("ejecutando el controlador Spring MVC"); 
            model.addAttribute("mensaje", mensaje);
            model.addAttribute("saludo", saludo);
            // model.addAttribute("persona", persona);
            model.addAttribute("personas", personas);
            return "index";            
        }
}
