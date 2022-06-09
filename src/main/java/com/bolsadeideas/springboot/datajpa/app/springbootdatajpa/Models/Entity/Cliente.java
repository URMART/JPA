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
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty//validacion solo se utiliza con string cuando sea campo requrido
    private String Nombre;

    @NotEmpty//validacion 
    private String Apellido;

    @NotEmpty//validacion 
    @Email
    private String Email;

    @NotNull//validacion 
    private long Celular;


    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Fecha;

    //guardando fecha

    //@PrePersist//para decir que la fecha es actual
    //public void PrePersist(){

      //  Fecha= new Date();


    //}

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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Long getCelular() {
        return Celular;
    }

    public void setCelular(Long celular) {
        Celular = celular;
    }

    

    

    
    
}
