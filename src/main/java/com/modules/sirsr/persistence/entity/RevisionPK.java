/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modules.sirsr.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Edward Reyes
 */
@Embeddable
public class RevisionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FECHA_REVISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRevision;
    @Basic(optional = false)
    @Column(name = "ID_REQUISICION")
    private int idRequisicion;

    public RevisionPK() {
    }

    public RevisionPK(Date fechaRevision, int idRequisicion) {
        this.fechaRevision = fechaRevision;
        this.idRequisicion = idRequisicion;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public int getIdRequisicion() {
        return idRequisicion;
    }

    public void setIdRequisicion(int idRequisicion) {
        this.idRequisicion = idRequisicion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fechaRevision != null ? fechaRevision.hashCode() : 0);
        hash += (int) idRequisicion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RevisionPK)) {
            return false;
        }
        RevisionPK other = (RevisionPK) object;
        if ((this.fechaRevision == null && other.fechaRevision != null) || (this.fechaRevision != null && !this.fechaRevision.equals(other.fechaRevision))) {
            return false;
        }
        if (this.idRequisicion != other.idRequisicion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modules.sirsr.persistence.entity.RevisionPK[ fechaRevision=" + fechaRevision + ", idRequisicion=" + idRequisicion + " ]";
    }
    
}
