/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classes;
import br.com.ifba.atividade07.interfaces.Pagamento;
import javax.swing.JOptionPane;

public class PagamentoPix implements Pagamento {
    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return this.valor * 0.98; 
    }

    @Override
    public void imprimirRecibo() {
        //texto do recibo
        String textoRecibo = "=== RECIBO DE PAGAMENTO ===\n"
                           + "Método: PIX\n"
                           + "Valor original: R$ " + this.valor + "\n"
                           + "Cashback recebido: 2%\n"
                           + "Valor final a pagar: R$ " + this.calcularTotal();
        
        // Mostra o pop-up
        JOptionPane.showMessageDialog(null, textoRecibo, "Recibo - Pix", JOptionPane.INFORMATION_MESSAGE);
    }
}
