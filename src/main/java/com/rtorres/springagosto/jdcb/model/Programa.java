/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.jdcb.model;

/**
 *
 * @author SABADO-MANHANA
 */
public class Programa {
    private Long id;
    private String nombre;
    private String descripcion;
    private String codigo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
