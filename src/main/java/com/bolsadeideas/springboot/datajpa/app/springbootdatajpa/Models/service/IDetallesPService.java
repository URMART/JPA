package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.DetallesP;

public interface IDetallesPService {

        // vista de los clientes
        public List<DetallesP> findAll();

        public void save(DetallesP detallesp);

        public DetallesP findone(Long id);

        public void delete(Long id);

}
