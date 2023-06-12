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
public class Corriente extends Cuenta implements Serializable{

    @Override
    public void retirar(double cantidad) {
       double valor = super.getSaldo();
       valor-=cantidad; 
       super.setSaldo(valor);
       JOptionPane.showConfirmDialog(null, "El nuevo saldo en la cuenta corriente es: "+super.getSaldo());
    }

    @Override
    public void consignar(double cantidad) {
        double valor = super.getSaldo();
       valor+=cantidad; 
       super.setSaldo(valor);
       JOptionPane.showConfirmDialog(null, "El nuevo saldo en la cuenta corriente es: "+super.getSaldo());
    }

    
    
}
