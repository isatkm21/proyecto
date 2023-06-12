/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import cuentas.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ArchivoTexto implements Logica {
    
    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;
//    private 

    public ArchivoTexto() {
        this.archivo = new File("clientes.txt");
    }
    
    @Override
    public void agregarCliente(Cliente c, boolean mod) throws IOException{
        try {
            this.aEscritura = new FileWriter(this.archivo, mod);
            PrintWriter pw = new PrintWriter(this.aEscritura);
            pw.println(c.getDataFileFormat());
            pw.close();
        } catch (IOException ioe) {
            throw new IOException("El archivono existe o no pudo ser creado para escritura");

        } finally {
            if (this.aEscritura != null) {
                this.aEscritura.close();
            }
        }
    }
    
    @Override
    public Cliente buscarCliente(int id) throws  IOException{
        try {
            this.aLectura = new Scanner(this.archivo);
            while(this.aLectura.hasNext()){
                String datos[] = this.aLectura.nextLine().split(";");
                Cliente c = this.cargarDatos(datos);
                if(c.getId()==id){
                    return c;
                }
            
            }
            return null;
        } catch (FileNotFoundException fne) {

            throw new IOException("El archivo de lectura no existe o no es posible abrirlo");

        }finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }

    }
    
    @Override
    public List<Cliente> listaClientes() throws IOException {
        List<Cliente> listado = new ArrayList();
        try {
            this.aLectura = new Scanner(this.archivo);
            while(this.aLectura.hasNext()){
                String datos[] = this.aLectura.nextLine().split(";");
                Cliente c = this.cargarDatos(datos);
                listado.add(c);
            }
            return listado;
        } catch (FileNotFoundException fne) {
           throw new IOException("El archivo de lectura no existe o no es posible abrirlo");

        }finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }
    }
    
     private Cliente cargarDatos(String data[]){
        
        Cliente c=null;
        String nombre = data[0];
        int id = Integer.valueOf(data[1]);
        c=new Cliente(nombre,id);
        double saldoC = Double.valueOf(data[2]);
        c.getCorriente().setSaldo(saldoC);
        double saldoA = Double.valueOf(data[3]);
        c.getAhorro().setSaldo(saldoA);
        double saldocdt = Double.valueOf(data[4]);
        c.getCdt().setSaldo(saldocdt);
        return c;
    }
    
    @Override
     public void eliminar(){
        if (this.archivo.exists()) {
            if (this.archivo.delete()) {
                System.out.println("Archivo eliminado correctamente: ");
            } else {
                System.out.println("No se puede modificar el archivo: " );
            }
        } else {
            System.out.println("El archivo no existe: ");
        }
     }
}

