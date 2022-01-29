/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author franc
 */
public class Modelo {
    public boolean ValidaDato(String a){
        try{
           Double.parseDouble(a);
           return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    public double Suma(double a, double b){
        return a+b;
    }
    
    public double Resta(double a, double b){
        return a-b;
    }
    
    public double Multiplicacion(double a, double b){
        return a*b;
    }
    
    public double Division(double a, double b){
        return a/b;
    }
}
