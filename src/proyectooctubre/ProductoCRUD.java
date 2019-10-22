/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooctubre;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ProductoCRUD {
    int numProd;
    Producto [] vectorProducto;
    int tamanioVector;
    
    public ProductoCRUD(){
        tamanioVector = 5;
        numProd = -1;
        vectorProducto = new Producto [tamanioVector];
    }
    
    public void registrarProducto(Producto prod){
        numProd++;
        vectorProducto[numProd] = prod;
    }
    
    public void listarProductos(){
        String salida  = "Listado de productos \n"+
                          "<html><table border=1 cellspacing=0 cellpadding=2>"+
                          "<tr>"+
                                "<td>Codigo</td>"+
                                "<td>Nombre</td>"+
                                "<td>Precio compra</td>"+
                                "<td>Precio venta</td>"+
                                "<td>Estado</td>"+
                          "</tr>";
        for (int i = 0; i <= numProd; i++) {
            Producto prod = vectorProducto[i];
            salida += "<tr>"+
                          "<td>" + prod.getCodigo() + "</td>"+
                          "<td>" + prod.getNombre() + "</td>"+
                          "<td>" + prod.getPrecioCompra() + "</td>"+
                          "<td>" + prod.getPrecioVenta() + "</td>"+
                          "<td>" + prod.getEstado() + "</td>"+
                        "</tr>";
            
        }
        salida += "</table></html>";
        JOptionPane.showMessageDialog(null, salida);
    }
}
