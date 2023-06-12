/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

import datos.Archivable;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author ISABELLA MANJARRES
 */
public class Cliente implements Archivable {
    private String nombre;
    private int id;
    private CDT cdt;
    private Corriente corriente;
    private Ahorro ahorro;

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.ahorro = new Ahorro();
        this.corriente = new Corriente();
        this.crearCDT(0, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public CDT getCdt() {
        return cdt;
    }

    public Corriente getCorriente() {
        return corriente;
    }

    public Ahorro getAhorro() {
        return ahorro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCdt(CDT cdtt) {
        this.cdt=new CDT();
        this.cdt.setSaldo(cdtt.getSaldo());
        this.cdt.setIntereses(cdtt.getIntereses());
    }

    public void setCorriente(Corriente corriente) {
        this.corriente = corriente;
    }

    public void setAhorro(Ahorro ahorro) {
        this.ahorro = ahorro;
    }
    
    public double montoTotal(){
        return this.cdt.getSaldo()+this.corriente.getSaldo()+this.ahorro.getSaldo();
    }
    
    public void guardar(PrintWriter writer){
        writer.println(this.getNombre());
        writer.println(this.getId());
        writer.println(this.getAhorro().getSaldo());
        writer.println(this.getCorriente().getSaldo());
        writer.println(this.getCdt().getSaldo());
    }

    @Override
    public String getDataFileFormat() {
        return this.getNombre()+";"+
                this.getId()+";"+
                this.getCorriente().getSaldo()+";"+
                this.getAhorro().getSaldo()+";"+
                this.getCdt().getSaldo();
    }

    @Override
    public String[] getDataForTable() {
        String data[] ={this.getNombre(),
                              String.valueOf(this.getId()),
                              String.valueOf(this.getCorriente().getSaldo()),
                              String.valueOf(this.getAhorro().getSaldo()),
                              String.valueOf(this.getCdt().getSaldo())
                            };
          return data;
    }
    
    public void crearCDT(double saldo, double intereses){
        this.cdt= new CDT(saldo, intereses);
    }
}
