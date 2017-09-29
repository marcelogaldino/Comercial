/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Cliente;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author marcelo
 */
@ApplicationScoped
public class ClienteDAOImpl extends GenericDAO<Cliente, Long> implements ClienteDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(ClienteDAOImpl.class);

    public ClienteDAOImpl() {
        super(Cliente.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
