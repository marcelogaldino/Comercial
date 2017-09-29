package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.ItensVenda;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.ItensVendaDAO;
import com.genericrest.service.ProdutoService;

/**
 *
 * @author marcelo
 */
@ManagedBean
@Path("/ItensVenda")
public class ItensVendaRestService extends GenericCRUDRestService<ItensVenda> implements ProdutoService{
    
    private static final Logger LOG = LoggerFactory.getLogger(ItensVendaRestService.class);
    
    @Inject
    private ItensVendaDAO itensVendaDAO;

    public ItensVendaRestService() {
        super(ItensVenda.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<ItensVenda> list) {
        return new GenericEntity<List<ItensVenda>>(list){};
    }

    @Override
    public DAO getDao() {
        return itensVendaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
