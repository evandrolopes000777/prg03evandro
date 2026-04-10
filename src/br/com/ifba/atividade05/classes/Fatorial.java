/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.classes;

/**
 *
 * @author evand
 */
public class Fatorial {
    private int numInformado = 0;
    private int resultFatorial = 1;
    private String formula = "";
    
    public void setValor(int valorRecebido){
        numInformado = valorRecebido;
        int acumulado = 1;
        String texto = "";
        
        for (int contador = valorRecebido; contador > 1; contador--) {
            acumulado = acumulado * contador;     
            texto = texto + contador + " x "; 
        }
        texto = texto + "1 ";    
        resultFatorial = acumulado;        
        formula = texto;
    }
    
    public int getFatorial() {
        return resultFatorial; 
    }

    public String getFormula() {
        return formula; 
    }
}
