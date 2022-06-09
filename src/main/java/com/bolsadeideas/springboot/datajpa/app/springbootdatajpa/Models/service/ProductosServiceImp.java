package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IProductosDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosServiceImp implements IProductosService {
    @Autowired
    private IProductosDao productosDao;
    
    
    @Override
    @Transactional(readOnly  = true)
    public List<Productos> findAllr() {
        // TODO Auto-generated method stub
        return productosDao.findAllr();
    }
    @Override
    @Transactional
    public void saver(Productos productos) {
        // TODO Auto-generated method stub
        productosDao.saver(productos);
    }
  
    @Override
    @Transactional(readOnly  = true)
    public Productos findoner(Long id) { // controlador service - service con dao y dao con datos
        
        // TODO Auto-generated method stub
        return productosDao.findoner(id);
    }

    @Override
    @Transactional
    public void deleter(Long id) {
        // TODO Auto-generated method stub
        
        productosDao.deleter(id);
    }

}
