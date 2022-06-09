package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IPedidosDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidosServiceImp implements IPedidosService {
    @Autowired //
    private IPedidosDao pedidosDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pedidos> findAll() {
        // TODO Auto-generated method stub
        return pedidosDao.findAll();
    }

    @Override
    @Transactional
    public void save(Pedidos pedidos) {
        // TODO Auto-generated method stub
        pedidosDao.save(pedidos);
    }

    @Override
    @Transactional(readOnly = true)
    public Pedidos findone(Long id) { // controlador service - service con dao y dao con datos

        // TODO Auto-generated method stub
        return pedidosDao.findone(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub

        pedidosDao.delete(id);
    }

}
