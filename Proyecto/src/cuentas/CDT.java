/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author ISABELLA MANJARRES
 */
public class CDT  {
    private double intereses;
    private double saldo;
   

    public CDT() {
        this.saldo = 0.0;
    }

    public CDT(double saldo, double intereses) {
        this.saldo = saldo;
        this.intereses = intereses;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getIntereses() {
        return intereses;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
    
    public double cerrar(){
        double dinero = this.saldo;
        this.saldo=0.0;
        return dinero;
    }
    
    public void aumentarMes(int numMeses){
        double valor = this.getSaldo();
        for(int i=0; i<numMeses ; i++){
            valor= valor + (valor*this.intereses);
        }
        this.setSaldo(valor);
    }
}
