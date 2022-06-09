package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "detallesp")
public class DetallesP implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull // validacion
    @Column(name = "id_pedidos")
    private long idPedidos;

    @NotNull // validacion
    @Column(name = "id_productos")
    private long idProductos;

    @NotNull // validacion
    private long Descuento;

    @NotNull // validacion
    private long Cantidad;

    @NotNull // validacion
    private long Valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(Long idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Long getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Long idProductos) {
        this.idProductos = idProductos;
    }

    public Long getDescuento() {
        return Descuento;
    }

    public void setDescuento(Long descuento) {
        Descuento = descuento;
    }

    public Long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Long cantidad) {
        Cantidad = cantidad;
    }

    public Long getValor() {
        return Valor;
    }

    public void setValor(Long valor) {
        Valor = valor;
    }

}
