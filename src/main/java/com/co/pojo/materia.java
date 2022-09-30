
package com.co.pojo;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="materia")
public class materia {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idmateria;
    private String nombre;
    private int idnotas;
}
