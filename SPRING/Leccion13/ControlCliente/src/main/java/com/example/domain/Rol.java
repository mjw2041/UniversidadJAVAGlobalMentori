
package com.example.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table (name ="role")
public class Rol implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRol;        
   
    @NotEmpty 
    private String nombre;    
}
