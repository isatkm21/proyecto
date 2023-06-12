/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import cuentas.Cliente;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ISABELLA MANJARRES
 */
public class ListaClientes implements Logica, Serializable{
    private List<Cliente> listado; 
    
    public ListaClientes(){
        this.listado = new ArrayList();
    }
    @Override
    public void agregarCliente(Cliente c) throws IOException{
        this.listado.add(c);
        JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
    }

    @Override
    public Cliente buscarCliente(int id) {
        for (Cliente c: this.listado){
            if(c.getId()==id){
                return c; 
            }
        }
        return null; 
    }

    @Override
    public List<Cliente> listaClientes() {
       return this.listado;
    }

    public List<Cliente> getListado() {
        return listado;
    }
    
}
