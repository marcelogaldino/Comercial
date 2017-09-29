/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "itensVenda")
@XmlRootElement
public class ItensVenda extends AbstractEntity {
    
    private Integer quantidade;

    public ItensVenda() {
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
        final ItensVenda other = (ItensVenda) obj;
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "quantidade=" + quantidade + '}';
    }

    @Override
    public void updateParameters(Object entity) {
        final ItensVenda area = (ItensVenda) entity;
        this.quantidade = area.getQuantidade();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer Quantidade) {
        this.quantidade = quantidade;
    }
    
}
