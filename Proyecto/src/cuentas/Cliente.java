/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

import java.io.Serializable;

/**
 *
 * @author ISABELLA MANJARRES
 */
public class Cliente implements Serializable {
    private String nombre;
    private int id;
    private CDT cdt;
    private Corriente corriente;
    private Ahorro ahorro;

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.cdt = new CDT();
        this.ahorro = new Ahorro();
        this.corriente = new Corriente();
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

    public void setCdt(CDT cdt) {
        this.cdt = cdt;
    }

    public void setCorriente(Corriente corriente) {
        this.corriente = corriente;
    }

    public void setAhorro(Ahorro ahorro) {
        this.ahorro = ahorro;
    }
    
    
}
