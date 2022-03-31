
package com.example.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@Slf4j
public class ContrladorInicio {
        @GetMapping("/")   
        public String inicio() {            
            log.info("ejecutando el controlador Rest"); 
            return "Hola Mundo con Spring 3";            
        }
}
