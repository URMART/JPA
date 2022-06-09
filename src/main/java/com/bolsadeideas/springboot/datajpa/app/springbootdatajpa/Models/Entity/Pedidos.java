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
@Table(name = "pedidos")
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull // validacion
    @Column(name = "id_cliente")
    private long idCliente;

    @NotEmpty // validacion solo se utiliza con string cuando sea campo requrido
    @Column(name = "celular_destino")
    private String CelularDestino;

    @NotEmpty // validacion
    @Column(name = "direccion_destino")
    private String DireccionDestino;

    @NotEmpty // validacion
    @Column(name = "nombre_destino")
    private String NombreDestino;

    @NotNull // validacion
    @Column(name = "total")
    private long Total;

    @NotNull // validacion
    @Column(name = "sub_total")
    private long SubTotal;

    @NotNull // validacion
    @Column(name = "descuento")
    private long Descuento;

    @NotEmpty // validacion
    @Column(name = "estado")
    private String Estado;

    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Fecha;

    @NotNull
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date FechaEntrega;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCelularDestino() {
        return CelularDestino;
    }

    public void setCelularDestino(String celularDestino) {
        CelularDestino = celularDestino;
    }

    public String getDireccionDestino() {
        return DireccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        DireccionDestino = direccionDestino;
    }

    public String getNombreDestino() {
        return NombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        NombreDestino = nombreDestino;
    }

    public Long getTotal() {
        return Total;
    }

    public void setTotal(Long total) {
        Total = total;
    }

    public Long getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Long subTotal) {
        SubTotal = subTotal;
    }

    public Long getDescuento() {
        return Descuento;
    }

    public void setDescuento(Long descuento) {
        Descuento = descuento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

}