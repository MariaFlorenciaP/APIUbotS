
package app;

import clientews.WSVinhos;
import entity.Cliente;
import entity.Compra;
import java.util.List;


public class MainApp {
    
    public static void main(String[] args) throws Exception {
        
        
        
        List<Cliente> clientes = WSVinhos.getClientes();
        List<Compra> compras = WSVinhos.getCompras();
        
        printClientes(clientes);
        printCompras(compras);
        
    }
    
    
    private static void printClientes(List<Cliente> clientes){
        for (Cliente cliente: clientes){
            System.out.println(cliente.toString());
        }
    }
        
        private static void printCompras(List<Compra> compras){
        
        }
    }
    

