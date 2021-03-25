package com.modules.sirsr.tipoProducto.application;


import com.modules.sirsr.estatus.application.EstatusDTO;
import com.modules.sirsr.objetoGasto.application.ObjetoDeGastoDTO;

public class TipoProductoDTO {
    private Integer idTipoProducto;
    private String descripcion;
    private ObjetoDeGastoDTO objetoDeGasto;
    private EstatusDTO estatus;

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstatusDTO getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusDTO estatus) {
        this.estatus = estatus;
    }

    public ObjetoDeGastoDTO getObjetoDeGasto() {
        return objetoDeGasto;
    }

    public void setObjetoDeGasto(ObjetoDeGastoDTO objetoDeGasto) {
        this.objetoDeGasto = objetoDeGasto;
    }
}
