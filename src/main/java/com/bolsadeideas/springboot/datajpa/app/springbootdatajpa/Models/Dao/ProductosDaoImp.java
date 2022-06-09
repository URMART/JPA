package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Productos;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//metodos para acceder a las entidades
@Repository("ProductosDaoJPA")
public class ProductosDaoImp implements IProductosDao {

    @PersistenceContext
    private EntityManager em;// comtrolador de las entidades em = emtyty manayer

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override

    public List<Productos> findAllr() {
        return em.createQuery("from Productos").getResultList();
    }

    // se utiliza para la creacion del objeto save
    @Override
    // se pone para guardas los clientes
    @Transactional
    public void saver(Productos productos) {

        if (productos.getId() != null && productos.getId() > 0) {

            
            em.merge(productos);


        } else {

            // guardar los client
            em.persist(productos);
        }

    }

    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override
    public Productos findoner(Long id) {

        return em.find(Productos.class, id);// retornando la entidad con el em, la Clase y el id a consultar
    }

    //primero se va a la icliente osea interface para declarar el metodo y luego se viene a dao para editar el codigo
    @Override
    @Transactional
    public void deleter(Long id) {
        
        Productos productos = findoner(id);
        em.remove(productos);
    }

  



    


}
