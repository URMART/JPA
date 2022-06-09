package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Productos;

//Dao objeto de acceso a datos
public interface IProductosDao {

    // vista de los clientes
    public List<Productos> findAllr();

    public Productos findoner(Long id);

    public void deleter(Long id);

    public void saver(Productos productos);

}
