/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author marco
 */
public abstract class Pedido {
    protected int idPedido = 0;
    protected static int contadorDeInstancias = 0;
    protected LocalDate fechaCreacion;
    protected double montoBase;

    public Pedido(LocalDate fechaCreacion, double montoBase) {
        this.fechaCreacion = fechaCreacion;
        this.setMontoBase(montoBase);
        //Contar cantidad de instancias.
        this.contadorDeInstancias += 1;
        this.idPedido = this.contadorDeInstancias;
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        if(montoBase > 0)
        {
            this.montoBase = montoBase;
        }
        else
        {
            throw new IllegalArgumentException("El monto base debe ser "
                    + "mayor a 0...");
        }
    }
    
    
    
    public abstract double calcularPrecioFinal();
    
}
