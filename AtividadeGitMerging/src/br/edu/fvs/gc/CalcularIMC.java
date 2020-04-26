/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fvs.gc;

/**
 *
 * @author pessoal
 */
public class CalcularIMC {
    public int calcularIMC(double altura, double peso){
        altura = 10;
        peso = 20;
        return (int) ((altura * 2)/peso);
    }
    
    public double converterFarenheitParaCelcius() {

        double celcius = 38;

        double resultado = (celcius * 1.8) + 32;
        return resultado;
    }
}