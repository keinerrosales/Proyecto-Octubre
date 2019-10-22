/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooctubre;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class ProyectoOctubre {


 public static void main(String[] args) {
     ProductoCRUD prodCrud = new ProductoCRUD();
     Producto prod = new Producto("P001", "Teclado", 25000, 30000, "Activo");
     
     prodCrud.registrarProducto(prod);
     prodCrud.listarProductos();
     
   }
 

}

