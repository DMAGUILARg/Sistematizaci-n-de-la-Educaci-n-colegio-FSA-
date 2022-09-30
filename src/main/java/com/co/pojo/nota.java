
package com.co.pojo;

import javax.persistence.*;
import lombok.Data;


@Data

@Entity
@Table(name="nota")
public class nota {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idnota;
    private int nota_uno;
    private int nota_dos;
    private int nota_tre;
    private String observacion;
    
}
