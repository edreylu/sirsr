/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modules.sirsr.producto.application;

import com.modules.sirsr.estatus.application.EstatusDTO;
import com.modules.sirsr.tipoProducto.application.TipoProductoDTO;
import com.modules.sirsr.unidadMedida.application.UnidadMedidaDTO;
import java.util.Date;

/**
 *
 * @author Edward Reyes
 */
public class ProductoDTO {
    private Integer idProducto;
    private String caracteristicas;
    private Double precioDeReferencia;
    private Date fechaActualizacion;
    private int permisoUr;
    private UnidadMedidaDTO unidadMedida;
    private TipoProductoDTO tipoProducto;
    private EstatusDTO estatus;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecioDeReferencia() {
        return precioDeReferencia;
    }

    public void setPrecioDeReferencia(Double precioDeReferencia) {
        this.precioDeReferencia = precioDeReferencia;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getPermisoUr() {
        return permisoUr;
    }

    public void setPermisoUr(int permisoUr) {
        this.permisoUr = permisoUr;
    }

    public UnidadMedidaDTO getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedidaDTO unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public TipoProductoDTO getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProductoDTO tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public EstatusDTO getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusDTO estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "idProducto=" + idProducto +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", precioDeReferencia=" + precioDeReferencia +
                ", fechaActualizacion=" + fechaActualizacion +
                ", permisoUr=" + permisoUr +
                ", unidadMedida=" + unidadMedida +
                ", tipoProducto=" + tipoProducto +
                ", estatus=" + estatus +
                '}';
    }
}
