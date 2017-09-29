/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "venda")
@XmlRootElement
public class Venda extends AbstractEntity{
    
    @Temporal(TemporalType.DATE)
    private Date data;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "data=" + data + '}';
    }

    public Venda() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Venda Venda = (Venda) entity;
        this.data = Venda.getData);
    }

    public Date getData() {
        return data;
    }

    public void setNome(Date data) {
        this.data = data;
    }

}
