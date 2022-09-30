
package com.co.pojo;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="nota_definitiva")
public class notadefinitiva {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idnota_definitiva;
    private int definitiva;
    private int idnota;
}
