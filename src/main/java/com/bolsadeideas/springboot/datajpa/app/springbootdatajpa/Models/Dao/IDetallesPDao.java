package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.DetallesP;


//Dao objeto de acceso a datos
public interface IDetallesPDao {

    //
    public List<DetallesP> findAll();

    public void save(DetallesP detallesp);

    public DetallesP findone(Long id);

    public void delete(Long id);

}
