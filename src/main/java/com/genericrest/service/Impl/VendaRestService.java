package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Venda;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.VendaDAO;
import com.genericrest.service.VendaService;

/**
 *
 * @author marcelo
 */
@ManagedBean
@Path("/Venda")
public class VendaRestService extends GenericCRUDRestService<Venda> implements VendaService{
    
    private static final Logger LOG = LoggerFactory.getLogger(VendaRestService.class);
    
    @Inject
    private VendaDAO vendaDAO;

    public VendaRestService() {
        super(Venda.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Venda> list) {
        return new GenericEntity<List<Venda>>(list){};
    }

    @Override
    public DAO getDao() {
        return vendaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
