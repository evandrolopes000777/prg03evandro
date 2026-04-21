/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade09.main;

import br.com.ifba.atividade09.classes.Circulo;
import br.com.ifba.atividade09.classes.Cubo;
import br.com.ifba.atividade09.classes.Esfera;
import br.com.ifba.atividade09.classes.Forma;
import br.com.ifba.atividade09.classes.Forma2D;
import br.com.ifba.atividade09.classes.Forma3D;
import br.com.ifba.atividade09.classes.Piramide;
import br.com.ifba.atividade09.classes.Quadrado;
import br.com.ifba.atividade09.classes.Triangulo;

public class MainSistema {

    public static void main(String[] args) {
        //medida dos lados/raio
        Quadrado q = new Quadrado(5.0);
        Circulo c = new Circulo(3.0);
        //medida da base e altura
        Triangulo t = new Triangulo(4.0, 6.0);
        
        Cubo cubo = new Cubo(4.0);
        Esfera esf = new Esfera(5.0);
        //medida da base e altura
        Piramide pir = new Piramide(3.0, 4.0);
        
        Forma[] armarioDeFormas = new Forma[6];
        
        armarioDeFormas[0] = q;
        armarioDeFormas[1] = c;
        armarioDeFormas[2] = t;
        armarioDeFormas[3] = cubo;
        armarioDeFormas[4] = esf;
        armarioDeFormas[5] = pir;

        System.out.println("=== FORMAS ===\n");
        
        for (int i = 0; i < 6; i++) {
            
            Forma formaAtual = armarioDeFormas[i];
            
            System.out.println(formaAtual.toString());
            
            if (formaAtual instanceof Forma2D) {
                System.out.println("-> Essa é uma forma 2D ");
                System.out.println("-> Área: " + formaAtual.obterArea());
            } 
            
           
            else if (formaAtual instanceof Forma3D) {
                System.out.println("-> Essa é uma forma 3D ");
                System.out.println("-> Área total: " + formaAtual.obterArea());
                Forma3D transformadoEm3D = (Forma3D) formaAtual;
                System.out.println("-> Volume: " + transformadoEm3D.obterVolume());
            }
            
            System.out.println("-----------------------------------");
        }
    }
}
