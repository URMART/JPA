package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import javax.validation.Valid;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Productos;

public interface IProductosService {




        // vista de los clientes
        public List<Productos> findAllr();

        public void saver(@Valid Productos productos);

        public Productos findoner(Long id);

        public void deleter(Long id);

      

     



}
