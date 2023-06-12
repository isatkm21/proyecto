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
public abstract class Cuenta implements Serializable{
    private double saldo; 

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta(){
         this.saldo=0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void retirar();
    public abstract void consignar();
}
