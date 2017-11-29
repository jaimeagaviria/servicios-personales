package com.serviciospersonales.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "departamentos",  indexes = {@Index(name = "departamento_pk", columnList = "departamento_id", unique = true),
                                           @Index(name = "departamento_uk", columnList = "nombre", unique = true)})
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sec_departamento_id")
    @SequenceGenerator(name = "sec_departamento_id", sequenceName = "sec_departamento", allocationSize = 1, initialValue = 1)
    @Column(name = "departamento_id")
    private Integer departamentoID;

    @NotBlank
    @Column(name = "nombre", length = 200, nullable = false)
    private String nombre;

    public Integer getDepartamentoID() {
        return departamentoID;
    }

    public void setDepartamentoID(Integer departamentoID) {
        this.departamentoID = departamentoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
