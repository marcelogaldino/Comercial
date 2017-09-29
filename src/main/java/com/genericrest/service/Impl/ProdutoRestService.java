package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Produto;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.ProdutoDAO;
import com.genericrest.service.ProdutoService;

/**
 *
 * @author marcelo
 */
@ManagedBean
@Path("/produto")
public class ProdutoRestService extends GenericCRUDRestService<Produto> implements ProdutoService{

    public ProdutoRestService() {
        super(Produto.class);
    }
    
    private static final Logger LOG = LoggerFactory.getLogger(ProdutoRestService.class);  
    
    @Inject
    private ProdutoDAO produtoDAO;

    @Override
    public GenericEntity listToGenericEntity(List<Produto> list) {
        return new GenericEntity<List<Produto>>(list){};
    }

    @Override
    public DAO getDao() {
        return  produtoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}