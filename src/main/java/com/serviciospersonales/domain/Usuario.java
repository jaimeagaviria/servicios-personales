package com.serviciospersonales.domain;


import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sec_usuario_id")
    @SequenceGenerator(name = "sec_usuario_id", sequenceName = "sec_usuario", allocationSize = 1, initialValue = 1)
    @Column(name = "usuario_id")
    private Integer usuarioID;

    public Integer getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }
}
