/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import cuentas.Cliente;
import java.util.List;

/**
 *
 * @author ISABELLA MANJARRES
 */
public interface Logica {
    void agregarCliente(Cliente c);
    Cliente buscarCliente(int id);
    List<Cliente> listaClientes();
    
}
