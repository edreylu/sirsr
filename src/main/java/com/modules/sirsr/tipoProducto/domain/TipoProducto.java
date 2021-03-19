/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modules.sirsr.tipoProducto.domain;

import com.modules.sirsr.estatus.domain.Estatus;
import com.modules.sirsr.objetoGasto.domain.ObjetoDeGasto;
import com.modules.sirsr.producto.domain.Producto;
import com.modules.sirsr.subTipoProducto.domain.SubTipoProducto;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Edward Reyes
 */
@Entity
@Table(name = "TIPO_PRODUCTO")
public class TipoProducto{

    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_PRODUCTO")
    private Integer idTipoProducto;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "OBJETO_GASTO", insertable = false, updatable = false)
    private String objetoGastoStr;
    @JoinColumn(name = "OBJETO_GASTO", referencedColumnName = "OBJETO_GASTO")
    @ManyToOne(optional = false)
    private ObjetoDeGasto objetoGasto;
    @JoinColumn(name = "ID_ESTATUS", referencedColumnName = "ID_ESTATUS")
    @ManyToOne(optional = false)
    private Estatus estatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProducto")
    private List<SubTipoProducto> subTipoProductos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProducto")
    private List<Producto> productos;

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

    public ObjetoDeGasto getObjetoGasto() {
        return objetoGasto;
    }

    public void setObjetoGasto(ObjetoDeGasto objetoGasto) {
        this.objetoGasto = objetoGasto;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public List<SubTipoProducto> getSubTipoProductos() {
        return subTipoProductos;
    }

    public void setSubTipoProductos(List<SubTipoProducto> subTipoProductos) {
        this.subTipoProductos = subTipoProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getObjetoGastoStr() {
        return objetoGastoStr;
    }

    public void setObjetoGastoStr(String objetoGastoStr) {
        this.objetoGastoStr = objetoGastoStr;
    }
}
