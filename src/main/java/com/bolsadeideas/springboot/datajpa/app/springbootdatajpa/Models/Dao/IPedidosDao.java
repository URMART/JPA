package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Pedidos;

//Dao objeto de acceso a datos
public interface IPedidosDao {

    //
    public List<Pedidos> findAll();

    public void save(Pedidos cliente);

    public Pedidos findone(Long id);

    public void delete(Long id);

}
