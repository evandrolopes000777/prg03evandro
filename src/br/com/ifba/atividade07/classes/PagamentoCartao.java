/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classes;
import br.com.ifba.atividade07.interfaces.Pagamento;
import javax.swing.JOptionPane;

public class PagamentoCartao implements Pagamento {
    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return this.valor * 1.05; 
    }

    @Override
    public void imprimirRecibo() {
        //texto do recibo
        String textoRecibo = "=== RECIBO DE PAGAMENTO ===\n"
                           + "Método: CARTÃO DE CRÉDITO\n"
                           + "Valor original: R$ " + this.valor + "\n"
                           + "Taxa da maquininha: 5%\n"
                           + "Valor final a pagar: R$ " + this.calcularTotal();
        
        // Mostra o pop-up
        JOptionPane.showMessageDialog(null, textoRecibo, "Recibo - Cartão", JOptionPane.INFORMATION_MESSAGE);
    }
}
