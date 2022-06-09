package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.DetallesP;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//metodos para acceder a las entidades
@Repository("DetallesPDaoJPA")
public class DetallesPDaoImp implements IDetallesPDao {

    @PersistenceContext
    private EntityManager em;// comtrolador de las entidades em = emtyty manayer

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override

    public List<DetallesP> findAll() {
        return em.createQuery("from DetallesP").getResultList();
    }

    // se utiliza para la creacion del objeto save
    @Override
    // se pone para guardas los clientes
    @Transactional
    public void save(DetallesP detallesp) {

        if (detallesp.getId() != null && detallesp.getId() > 0) {

            em.merge(detallesp);

        } else {

            // guardar los client
            em.persist(detallesp);
        }

    }

    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override
    public DetallesP findone(Long id) {

        return em.find(DetallesP.class, id);// retornando la entidad con el em, la Clase y el id a consultar
    }

    // primero se va a la icliente osea interface para declarar el metodo y luego se
    // viene a dao para editar el codigo
    @Override
    @Transactional
    public void delete(Long id) {

        DetallesP detallesp = findone(id);
        em.remove(detallesp);
    }

}
