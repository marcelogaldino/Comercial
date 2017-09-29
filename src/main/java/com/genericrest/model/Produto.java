/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findByNome", query = "select p from Produto p where p.nome = :nome")
})
@XmlRootElement
public class Produto extends AbstractEntity {
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(length = 255, nullable = false)
    private float valor;
    
    public Produto() {
    }    

    @Override
    public void updateParameters(Object entity) {
        final Produto Produto = (Produto) entity;
        
        this.nome = Produto.getNome();
        this.valor = Produto.getValor();
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.nome, other.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getValor() {
        return valor;
    }

    public void setMercado(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", valor=" + valor + '}';
    }

    
}
