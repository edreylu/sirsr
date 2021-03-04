/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modules.sirsr.usuario;


import com.modules.sirsr.personal.PersonalDTO;
import com.modules.sirsr.unidadResponsable.UnidadResponsableDTO;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Edward Reyes
 */

public class UsuarioDTO {
    private int noUsuario;
    private String userName;
    private String password;
    private String encrytedPassword;
    private Calendar fechaAuditoria;
    private Integer idEstatus;
    private Integer enabled;
    private PersonalDTO personal;
    private UnidadResponsableDTO unidadResponsable;


    public int getNoUsuario() {
        return noUsuario;
    }

    public void setNoUsuario(int noUsuario) {
        this.noUsuario = noUsuario;
    }

    public String getUserName() {
        return Objects.nonNull(userName) ? userName.toUpperCase() : userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public String getPassword() {
        return Objects.nonNull(password) ? password.toUpperCase() : password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

   
    public Calendar getFechaAuditoria() {
        return fechaAuditoria;
    }

    public void setFechaAuditoria(Calendar fechaAuditoria) {
        this.fechaAuditoria = fechaAuditoria;
    }

    public UnidadResponsableDTO getUnidadResponsable() {
        return unidadResponsable;
    }

    public void setUnidadResponsable(UnidadResponsableDTO unidadResponsable) {
        this.unidadResponsable = unidadResponsable;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public PersonalDTO getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalDTO personal) {
        this.personal = personal;
    }


}
