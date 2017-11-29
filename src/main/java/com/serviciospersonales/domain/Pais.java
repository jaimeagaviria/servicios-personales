package com.serviciospersonales.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "paises",  indexes = {@Index(name = "pais_pk", columnList = "pais_id", unique = true),
                                    @Index(name = "pais_uk", columnList = "codigo", unique = true)})
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sec_pais_id")
    @SequenceGenerator(name = "sec_pais_id", sequenceName = "sec_pais", allocationSize = 1, initialValue = 1)
    @Column(name = "pais_id")
    private Integer paisID;

    @NotBlank
    @Column(name = "nombre", length = 200, nullable = false)
    private String nombre;

    @NotBlank
    @Column(name = "codigo", length = 2, nullable = false)
    private String codigo;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
