/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Produto;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.ProdutoDAO;

@ApplicationScoped
public class ProdutoDAOImpl extends GenericDAO<Produto, Long> implements ProdutoDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(ProdutoDAOImpl.class);    

    public ProdutoDAOImpl() {
        super(Produto.class);
    }

    @Override
    public List<Produto> findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Produto.findByNome", Produto.class);
        query.setParameter("nome", nome);
      
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
