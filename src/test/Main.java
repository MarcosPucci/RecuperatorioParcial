/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.Sistema;
import model.PedidoElectronico;
import model.PedidoPapelMensual;
/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*PedidoElectronico pedidoElectronico1 = new PedidoElectronico(
                LocalDate.of(2024, 10, 18), 100.0, "Ejemplo", 5.0);
        System.out.println(pedidoElectronico1);
        
        PedidoElectronico pedidoElectronico2 = new PedidoElectronico(
                LocalDate.of(2020, 10, 18), 20.0, "Ejemplo321", 2.0);
        System.out.println(pedidoElectronico2);
        
        PedidoPapelMensual pedidoPapelMensual1 = new PedidoPapelMensual(
        LocalDate.of(2024, 10, 18), 200.0, LocalDate.of(2024, 3, 18), 10);
        System.out.println(pedidoPapelMensual1);
        
        PedidoPapelMensual pedidoPapelMensual2 = new PedidoPapelMensual(
        LocalDate.of(2021, 10, 18), 50.0, LocalDate.of(2023, 3, 18), 9);
        System.out.println(pedidoPapelMensual2);*/
        
        System.out.println("Test 1-1");
        Sistema sistema = new Sistema();
        /*sistema.agregarPedidoElectronico(LocalDate.of(2024, 10, 18), 
                100.0, "Ejemplo", 5.0);
        sistema.agregarPedidoElectronico(LocalDate.of(2023, 10, 18), 
                700.0, "Ejemploss", 2.0);*/
        sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 12, 12), 
                2500.0, LocalDate.of(2020, 12, 15), 5);
        
        System.out.println("Test 1-2");
        sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 12), 
                3000.0, "PC no funciona", 200.0);
        
        System.out.println("Test 1-3");
        try
        {
            PedidoPapelMensual pedidoPapelMensual1 = new PedidoPapelMensual(
        LocalDate.of(2020, 12, 12), 2500.0, LocalDate.of(2020, 12, 15), 0);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            PedidoElectronico pedidoElectronico1 = new PedidoElectronico(
                LocalDate.of(2020, 12, 12), 3500.0, "", 200.0);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Test 2-1");
        System.out.println("Precio final del PedidoPapelMensual (ID: 1): " + 
                sistema.traerPedido(1).calcularPrecioFinal());
        System.out.println("Precio final del PedidoPapelMensual (ID: 2): " + 
                sistema.traerPedido(2).calcularPrecioFinal());
        
        System.out.println("Test 3-1");
        sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 12, 12), 
                1200.0, LocalDate.of(2020, 12, 16), 3);
        sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 14), 
                3000.0, "PC no funciona", 200.0);
        sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 15), 
                3100.0, "Monitor no funciona", 210.0);
        
        System.out.println("Test 4-1");
        System.out.println(sistema.traerPedido("PC no funciona"));
        
        System.out.println("Test 4-2");
        System.out.println(sistema.calcularTotalGeneral());
    }
    
}
