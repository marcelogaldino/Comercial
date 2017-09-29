/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Venda;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.ItensVendaDAO;

/**
 *
 * @author marcelo
 */
@ApplicationScoped
public class ItensVendaDAOImpl extends GenericDAO<Venda, Long> implements ItensVendaDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(ItensVendaDAOImpl.class);

    public ItensVendaDAOImpl() {
        super(Venda.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;        
    }
    
}
