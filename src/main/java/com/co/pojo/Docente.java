
package com.co.pojo;

import javax.persistence.*;
import lombok.Data;


@Data

@Entity
@Table(name="docente")
public class Docente {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int iddocente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String materia;
    private String usuario;
    private String password;
    private int idmat;
}
