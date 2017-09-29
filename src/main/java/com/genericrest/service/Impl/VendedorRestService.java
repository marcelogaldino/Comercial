package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Vendedor;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.VendedorDAO;
import com.genericrest.service.VendedorService;

/**
 *
 * @author marcelo
 */
@ManagedBean
@Path("/Vendedor")
public class VendedorRestService extends GenericCRUDRestService<Vendedor> implements VendedorService{
    
    private static final Logger LOG = LoggerFactory.getLogger(VendedorRestService.class);
    
    @Inject
    private VendedorDAO vendedorDAO;

    public VendedorRestService() {
        super(Vendedor.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Vendedor> list) {
        return new GenericEntity<List<Vendedor>>(list){};
    }

    @Override
    public DAO getDao() {
        return vendedorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}

