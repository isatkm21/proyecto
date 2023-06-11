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
public class Ahorro extends Cuenta implements Serializable {
    private double intereses;

    public Ahorro(double intereses, double saldo) {
        super(saldo);
        this.intereses = intereses;
    }

    public Ahorro(double intereses) {
        this.intereses = intereses;
    }
    
    public Ahorro(){
        super(0);
        this.intereses =0;
    }
    
    @Override
    public void retirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consignar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
