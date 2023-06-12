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
        this.intereses = 0.6;
    }

    public Ahorro(double intereses) {
        this.intereses = intereses;
    }
    
    public Ahorro(){
        super(0);
        this.intereses =0.6;
    }
    
    @Override
<<<<<<< HEAD
    public void retirar(double cantidad) {
       double valor = super.getSaldo();
       valor-=cantidad; 
       super.setSaldo(valor);
       JOptionPane.showMessageDialog(null, "El nuevo saldo en la cuenta de ahorros es: "+super.getSaldo());
    }

    @Override
    public void consignar(double cantidad) {
        double valor = super.getSaldo();
       valor= valor+cantidad; 
       super.setSaldo(valor);
       JOptionPane.showMessageDialog(null, "El nuevo saldo en la cuenta de ahorros es: "+super.getSaldo());
    }
    
    public void aumentarMes(int numMeses){
        double valor = super.getSaldo();
        for(int i=0; i<numMeses ; i++){
            valor= valor + (valor*this.intereses);
        }
        super.setSaldo(valor);
       
    }
=======
    public void retirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consignar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
>>>>>>> 2f7623d458ded01ff4d3c3b6e778ee424ed07873
}
