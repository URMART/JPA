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

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "productos")
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty//validacion solo se utiliza con string cuando sea campo requrido
    private String Nombre;

    @NotEmpty//validacion 
    private String Cantidad;

    @NotNull//validacion 
    @Column(name = "precio_venta")
    private long PrecioVenta;
    
    
    @NotNull//validacion 
    @Column(name = "precio_compra")
    private long PrecioCompra;



    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;

    

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getCantidad() {
        return Cantidad;
    }


    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }


    public Long getPrecioVenta() {
        return PrecioVenta;
    }


    public void setPrecioVenta(Long precioVenta) {
        PrecioVenta = precioVenta;
    }


    public Long getPrecioCompra() {
        return PrecioCompra;
    }


    public void setPrecioCompra(Long precioCompra) {
        PrecioCompra = precioCompra;
    }


    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    



    

}