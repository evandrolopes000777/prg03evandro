/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classes;

import br.com.ifba.atividade07.interfaces.Pagamento;
import javax.swing.JOptionPane;

public class PagamentoDinheiro implements Pagamento {
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return this.valor * 0.90; 
    }

    @Override
    public void imprimirRecibo() {
        String textoRecibo = "=== RECIBO DE PAGAMENTO ===\n"
                           + "Método: DINHEIRO\n"
                           + "Valor original: R$ " + this.valor + "\n"
                           + "Desconto aplicado: 10%\n"
                           + "Valor final a pagar: R$ " + this.calcularTotal();
        
        JOptionPane.showMessageDialog(null, textoRecibo, "Recibo", JOptionPane.INFORMATION_MESSAGE);
    }
}