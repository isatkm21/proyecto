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
    
    public double montoTotal(){
        return this.cdt.getSaldo()+this.corriente.getSaldo()+this.ahorro.getSaldo();
    }
}
