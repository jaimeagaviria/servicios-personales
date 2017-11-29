package com.serviciospersonales.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sec_usuario_id")
    @SequenceGenerator(name = "sec_usuario_id", sequenceName = "sec_usuario", allocationSize = 1, initialValue = 1)
    @Column(name = "usuario_id")
    private Integer usuarioID;

    @NotBlank
    @Email
    @Column(name = "email", length = 200, nullable = false)
    private String email;

    @Column(name = "activo", nullable = false)
    private Boolean activo = false;

    public Integer getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
