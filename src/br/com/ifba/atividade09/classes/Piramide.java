/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classes;

/**
 *
 * @author evand
 */
public class Piramide extends Forma3D {
    private double ladoBase;
    private double altura;

    public Piramide(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        double areaBase = ladoBase * ladoBase;
        double apotema = Math.sqrt(Math.pow(ladoBase / 2.0, 2) + Math.pow(altura, 2));
        double areaLateral = 4 * ((ladoBase * apotema) / 2.0);
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        return ((ladoBase * ladoBase) * altura) / 3.0;
    }

    @Override
    public String toString() {
        return "Pirâmide de Base Quadrada [Lado da Base = " + ladoBase + ", Altura = " + altura + "]";
    }
}
