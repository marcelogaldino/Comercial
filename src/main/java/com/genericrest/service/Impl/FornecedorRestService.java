package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Fornecedor;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.FornecedorDAO;
import com.genericrest.service.FornecedorService;

/**
 *
 * @author marcelo
 */
@ManagedBean
@Path("/fornecedor")
public class FornecedorRestService extends GenericCRUDRestService<Fornecedor> implements AreaService{
    
    private static final Logger LOG = LoggerFactory.getLogger(FornecedorRestService.class);
    
    @Inject
    private AreaDAO fornecedorDAO;
    
    public FornecedorRestService() {
        super(Fornecedor.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Fornecedor> list) {
        return new GenericEntity<List<Fornecedor>>(list){};
    }

    @Override
    public DAO getDao() {
        return FornecedorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
        
}
