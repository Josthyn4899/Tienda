

package com.tienda.service.impl;

import java.util.List;
import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    
    public List<Categoria> getCategorias(boolean activos){
            var lista = categoriaDao.findAll();
            
            if(activos){
            lista.removeIf(c -> !c.isActivo());
            
            }
            return lista;
}
}
    
