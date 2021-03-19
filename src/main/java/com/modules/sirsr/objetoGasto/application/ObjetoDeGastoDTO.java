package com.modules.sirsr.objetoGasto.application;
import com.modules.sirsr.estatus.application.EstatusDTO;
import com.modules.sirsr.partidaGastoGenerica.domain.PartidaGastoGenerica;

import java.util.Date;

public class ObjetoDeGastoDTO {
    private String objetoGasto;
    private String descripcion;
    private String definicion;
    private Date fechaInicio;
    private Date fechaFinal;
    private EstatusDTO estatus;
    private PartidaGastoGenerica claveGenerica;

    public String getObjetoGasto() {
        return objetoGasto;
    }

    public void setObjetoGasto(String objetoGasto) {
        this.objetoGasto = objetoGasto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public EstatusDTO getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusDTO estatus) {
        this.estatus = estatus;
    }

    public PartidaGastoGenerica getClaveGenerica() {
        return claveGenerica;
    }

    public void setClaveGenerica(PartidaGastoGenerica claveGenerica) {
        this.claveGenerica = claveGenerica;
    }
}
