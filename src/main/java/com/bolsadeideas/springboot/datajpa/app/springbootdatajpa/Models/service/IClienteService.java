package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;

public interface IClienteService {

        // vista de los clientes
        public List<Cliente> findAll();

        public void save(Cliente cliente);

        public Cliente findone(Long id);

        public void delete(Long id);

}
