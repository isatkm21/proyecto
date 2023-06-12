/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import cuentas.Cliente;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ISABELLA MANJARRES
 */
public interface Logica {
    void agregarCliente(Cliente c)throws IOException ;
    Cliente buscarCliente(int id)throws IOException;
    List<Cliente> listaClientes() throws IOException ;
    
}
