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
public class PedidoPapelMensual extends Pedido{

    private LocalDate fechaEntrega;
    private int cantidadResmas;

    public PedidoPapelMensual(LocalDate fechaCreacion, 
            double montoBase, LocalDate fechaEntrega, int cantidadResmas) {
        super(fechaCreacion, montoBase);
        this.fechaEntrega = fechaEntrega;
        this.setCantidadResmas(cantidadResmas);
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadResmas() {
        return cantidadResmas;
    }

    public void setCantidadResmas(int cantidadResmas) {
        if(cantidadResmas > 0)
        {
            this.cantidadResmas = cantidadResmas;
        }
        else
        {
            throw new IllegalArgumentException("El valor para las resmas debe "
                    + "ser mayor a 0...");
        }
    }
    
    @Override
    public double calcularPrecioFinal() {
        
        return this.montoBase * this.cantidadResmas;
       
    }

    @Override
    public String toString() {
        return "PedidoPapelMensual{idPedido=" + this.idPedido + "fechaEntrega=" 
                + fechaEntrega + ", cantidadResmas=" + cantidadResmas + '}';
    }
    
}
