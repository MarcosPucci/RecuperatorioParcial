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
public class PedidoElectronico extends Pedido{
    
    private String motivo;
    private double porcentajeExtra;

    public PedidoElectronico(LocalDate fechaCreacion, 
            double montoBase, String motivo, double porcentajeExtra) {
        super(fechaCreacion, montoBase);
        this.setMotivo(motivo);
        this.setPorcentajeExtra(porcentajeExtra);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        if(motivo.length() > 0)
        {
            this.motivo = motivo;
        }
        else
        {
            throw new IllegalArgumentException("El campo 'motivo' no puede "
                    + "estar vacio...");
        }
    }

    public double getPorcentajeExtra() {
        return porcentajeExtra;
    }

    public void setPorcentajeExtra(double porcentajeExtra) {
        if(porcentajeExtra > 0)
        {
            this.porcentajeExtra = porcentajeExtra;
        }
        else
        {
            throw new IllegalArgumentException("El porcentaje extra debe ser "
                    + "mayor a 0...");
        }
    }
    
    @Override
    public double calcularPrecioFinal() {
        double precioExtraConPorcentaje;
        
        precioExtraConPorcentaje = (this.montoBase * this.porcentajeExtra) / 100;
        return this.montoBase + precioExtraConPorcentaje;
    }

    @Override
    public String toString() {
        return "PedidoElectronico ID: "+ this.idPedido + " Motivo: " + motivo;
    }
    
}
