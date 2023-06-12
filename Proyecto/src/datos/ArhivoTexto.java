/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import cuentas.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author david
 */
public class ArhivoTexto implements Logica, Archivo {
    
    private ListaClientes listado;
    private File archivo;
//    private 

    public ArhivoTexto() {
        this.archivo = new File("clientes.txt");
    }
    
    @Override
    public void agregarCliente(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Cliente buscarCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<Cliente> listaClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void guardar() {
        PrintWriter writer;
        if (!archivo.exists()) {//si el archivo no existe
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            Cliente aux;
            writer = new PrintWriter(this.archivo);
            for (int i = 0; i < listado.getListado().size(); i++) {
                aux = listado.getListado().get(i);
                aux.guardar(writer);
            }
            writer.close();
        } catch (Exception e) {
        }
        
    }
    
    @Override
    public void leerArchivo() {
        try {
            FileReader reader = new FileReader(this.archivo);
            BufferedReader bReader = new BufferedReader(reader);
            String linea = null;
            while(linea!=null){
                linea = bReader.readLine();
                if(linea!=null){
                    System.out.println(linea+"\n");
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
