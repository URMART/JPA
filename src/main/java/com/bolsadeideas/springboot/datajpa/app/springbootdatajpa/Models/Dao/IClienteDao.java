package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;

//Dao objeto de acceso a datos
public interface IClienteDao {

    //vista de los clientes
    public List<Cliente> findAll();


    public void save(Cliente cliente);


    public Cliente findone(Long id);

    public void delete(Long id);

    
}
