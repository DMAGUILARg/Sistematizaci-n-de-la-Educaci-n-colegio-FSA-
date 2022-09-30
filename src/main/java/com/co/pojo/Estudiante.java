
package com.co.pojo;

import javax.persistence.*;
import lombok.Data;

//CON Data se colocan los metodos accesores get y set
@Data 

//PERSISTENCIA HIBERNATE
@Entity
@Table(name="estudiante")

public class Estudiante {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idestudiante;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String grado;
    private String usuario;
    private String password;
    private int idmateria;

    
}
