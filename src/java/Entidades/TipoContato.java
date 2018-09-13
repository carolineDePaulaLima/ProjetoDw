/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Familia
 */
@Entity
@Table(name = "tipo_contato")
@NamedQueries({
    @NamedQuery(name = "TipoContato.findAll", query = "SELECT t FROM TipoContato t")})
public class TipoContato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_contato")
    private Integer idTipoContato;
    @Column(name = "nome_contato")
    private String nomeContato;

    public TipoContato() {
    }

    public TipoContato(Integer idTipoContato) {
        this.idTipoContato = idTipoContato;
    }

    public Integer getIdTipoContato() {
        return idTipoContato;
    }

    public void setIdTipoContato(Integer idTipoContato) {
        this.idTipoContato = idTipoContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoContato != null ? idTipoContato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoContato)) {
            return false;
        }
        TipoContato other = (TipoContato) object;
        if ((this.idTipoContato == null && other.idTipoContato != null) || (this.idTipoContato != null && !this.idTipoContato.equals(other.idTipoContato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TipoContato[ idTipoContato=" + idTipoContato + " ]";
    }
    
}
