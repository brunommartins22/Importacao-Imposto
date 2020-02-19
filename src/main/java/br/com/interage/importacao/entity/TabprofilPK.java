/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interage.importacao.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bruno
 */
@Embeddable
public class TabprofilPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CODPRO")
    private String codpro;
    @Basic(optional = false)
    @Column(name = "CODFIL")
    private int codfil;

    public TabprofilPK() {
    }

    public TabprofilPK(String codpro, int codfil) {
        this.codpro = codpro;
        this.codfil = codfil;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpro != null ? codpro.hashCode() : 0);
        hash += (int) codfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabprofilPK)) {
            return false;
        }
        TabprofilPK other = (TabprofilPK) object;
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        if (this.codfil != other.codfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interage.importacao.entity.TabprofilPK[ codpro=" + codpro + ", codfil=" + codfil + " ]";
    }
    
}
