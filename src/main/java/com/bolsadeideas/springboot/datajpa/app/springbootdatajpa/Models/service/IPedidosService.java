package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Pedidos;

public interface IPedidosService {

        // vista de los clientes
        public List<Pedidos> findAll();

        public void save(Pedidos pedidos);

        public Pedidos findone(Long id);

        public void delete(Long id);

}
