package com.genericrest.service.Impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Cliente;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.service.ClienteService;

/**
 *
 * @author marcelo
 */
@ManagedBean
@Path("/cliente")
public class ClienteRestService extends GenericCRUDRestService<Cliente> implements ClienteService{
          
    private static final Logger LOG = LoggerFactory.getLogger(AlunoRestService.class);
    
    @Inject
    private ClienteDAO clienteDAO;

    public ClienteRestService() {
        super(Cliente.class);
    }         
    
    @Override
    public GenericEntity listToGenericEntity(List<Cliente> list) {
        return new GenericEntity<List<Cliente>>(list){};
    }

    @Override
    public DAO getDao() {
        return clienteDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
       
}