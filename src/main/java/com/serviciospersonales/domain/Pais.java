package com.serviciospersonales.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;

@Entity
@Table(name = "paises")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sec_pais_id")
    @SequenceGenerator(name = "sec_pais_id", sequenceName = "sec_pais", allocationSize = 1, initialValue = 1)
    @Column(name = "pais_id")
    private Integer paisID;

    @NotBlank
    @Column(name = "nobre", length = 200, nullable = false)
    private String nombre;

    public Integer getPaisID() {
        return paisID;
    }

    public void setPaisID(Integer paisID) {
        this.paisID = paisID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
