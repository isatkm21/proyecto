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
public class CDT implements Serializable{
    private double saldo;
    private double intereses;

    public CDT() {
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
    
    
    public double cerrar(){
        return 0;
    }
    
    public void abrir(){
        
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
<<<<<<< HEAD
    
    public double cerrar(){
        double dinero = this.saldo;
        this.saldo=0.0;
        return dinero;
    }
    
    public void aumentarMes(int numMeses){
        for(int i=0; i<numMeses; i++){
        this.saldo = this.saldo + (this.saldo*this.intereses);    
        }
    }
=======
>>>>>>> 2f7623d458ded01ff4d3c3b6e778ee424ed07873
}
