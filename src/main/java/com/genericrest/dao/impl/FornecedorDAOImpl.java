/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Fornecedor;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.FornecedorDAO;

/**
 *
 * @author marcelo
 */
@ApplicationScoped
public class FornecedorDAOImpl extends GenericDAO<Fornecedor, Long> implements FornecedorDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(FornecedorDAOImpl.class);

    public FornecedorDAOImpl() {
        super(Fornecedor.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
