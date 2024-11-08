/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Sistema {
    private List<Pedido> pedidos = new ArrayList<>();
    
    public boolean agregarPedidoPapelMensual(LocalDate fechaCreacion, 
            double montoBase, LocalDate fechaEntrega, int cantidadResmas)
    {
        try
        {
            PedidoPapelMensual pedidoPapelMensual = new PedidoPapelMensual(
                    fechaCreacion, montoBase, fechaEntrega, cantidadResmas);
            
            this.pedidos.add(pedidoPapelMensual);
            System.out.println("PedidoPapelMensual agregado exitosamente"
                    + " con ID: " + pedidoPapelMensual.getIdPedido());
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
            return false;
        }
    }
    public boolean agregarPedidoElectronico(LocalDate fechaCreacion,
            double montoBase, String motivo, double porcentajeExtra)
    {
        try
        {
            PedidoElectronico pedidoElectronico = new PedidoElectronico(
            fechaCreacion, montoBase, motivo, porcentajeExtra);
            
            this.pedidos.add(pedidoElectronico);
            
            System.out.println("PedidoElectronico agregado exitosamente"
                    + " con ID: " + pedidoElectronico.getIdPedido());
            return true;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public List<Pedido> traerPedidos()
    {
        return this.pedidos;
    }
    public Pedido traerPedido(int idPedido)
    {
        for(Pedido pedido : this.pedidos)
        {
            System.out.println(pedido.getIdPedido());
            if(pedido.getIdPedido() == idPedido)
            {
                return pedido;
            }
        }
        return null;
    }
    /*Funcion para traer los pedidos dependiendo del motivo del mismo
    Retorna los pedidos encontrados con el motivo pasado por parametros.*/
    public List<Pedido> traerPedido(String motivo)
    {
        List<Pedido> pedidosElectronicos = new ArrayList<>();
        
        for(Pedido pedido : this.pedidos)
        {
            if(pedido instanceof PedidoElectronico pedidoElec)
            {
                if(pedidoElec.getMotivo() == motivo)
                {
                    pedidosElectronicos.add(pedidoElec);
                }
            }
        }
        return pedidosElectronicos;
    }
    /*Funcion para calcular el precio total a pagar 
    por todos los pedidos solicitados
    Retorna el total acumulado.*/
    public double calcularTotalGeneral()
    {
        double precioAcumulado = 0;
        for(Pedido pedido : this.pedidos)
        {
            precioAcumulado += pedido.calcularPrecioFinal();
        }
        return precioAcumulado;
    }
}
