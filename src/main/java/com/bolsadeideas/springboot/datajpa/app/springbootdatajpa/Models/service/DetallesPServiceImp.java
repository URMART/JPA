package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IDetallesPDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.DetallesP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetallesPServiceImp implements IDetallesPService {
    @Autowired //
    private IDetallesPDao detallespDao;

    @Override
    @Transactional(readOnly = true)
    public List<DetallesP> findAll() {
        // TODO Auto-generated method stub
        return detallespDao.findAll();
    }

    @Override
    @Transactional
    public void save(DetallesP detallesp) {
        // TODO Auto-generated method stub
        detallespDao.save(detallesp);
    }

    @Override
    @Transactional(readOnly = true)
    public DetallesP findone(Long id) { // controlador service - service con dao y dao con datos

        // TODO Auto-generated method stub
        return detallespDao.findone(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub

        detallespDao.delete(id);
    }

}
