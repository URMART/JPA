package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//metodos para acceder a las entidades
@Repository("ClienteDaoJPA")
public class ClienteDaoImp implements IClienteDao {

    @PersistenceContext
    private EntityManager em;// comtrolador de las entidades em = emtyty manayer

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override

    public List<Cliente> findAll() {
        return em.createQuery("from Cliente").getResultList();
    }

    // se utiliza para la creacion del objeto save
    @Override
    // se pone para guardas los clientes
    @Transactional
    public void save(Cliente cliente) {

        if (cliente.getId() != null && cliente.getId() > 0) {

            
            em.merge(cliente);


        } else {

            // guardar los client
            em.persist(cliente);
        }

    }

    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override
    public Cliente findone(Long id) {

        return em.find(Cliente.class, id);// retornando la entidad con el em, la Clase y el id a consultar
    }

    //primero se va a la icliente osea interface para declarar el metodo y luego se viene a dao para editar el codigo
    @Override
    @Transactional
    public void delete(Long id) {
        
        Cliente cliente = findone(id);
        em.remove(cliente);
    }

}
