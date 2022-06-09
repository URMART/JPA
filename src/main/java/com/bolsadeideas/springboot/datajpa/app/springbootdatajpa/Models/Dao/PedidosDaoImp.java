package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Pedidos;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//metodos para acceder a las entidades
@Repository("PedidosDaoJPA")
public class PedidosDaoImp implements IPedidosDao {

    @PersistenceContext
    private EntityManager em;// comtrolador de las entidades em = emtyty manayer

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override

    public List<Pedidos> findAll() {
        return em.createQuery("from Pedidos").getResultList();
    }

    // se utiliza para la creacion del objeto save
    @Override
    // se pone para guardas los clientes
    @Transactional
    public void save(Pedidos pedidos) {

        if (pedidos.getId() != null && pedidos.getId() > 0) {

            em.merge(pedidos);

        } else {

            // guardar los client
            em.persist(pedidos);
        }

    }

    @Transactional(readOnly = true) // solo lectura al reaalizar la consulta
    @Override
    public Pedidos findone(Long id) {

        return em.find(Pedidos.class, id);// retornando la entidad con el em, la Clase y el id a consultar
    }

    // primero se va a la icliente osea interface para declarar el metodo y luego se
    // viene a dao para editar el codigo
    @Override
    @Transactional
    public void delete(Long id) {

        Pedidos pedidos = findone(id);
        em.remove(pedidos);
    }

}
