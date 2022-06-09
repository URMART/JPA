package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImp implements IClienteService {
    @Autowired //
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        // TODO Auto-generated method stub
        return clienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        // TODO Auto-generated method stub
        clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findone(Long id) { // controlador service - service con dao y dao con datos

        // TODO Auto-generated method stub
        return clienteDao.findone(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub

        clienteDao.delete(id);
    }

}
