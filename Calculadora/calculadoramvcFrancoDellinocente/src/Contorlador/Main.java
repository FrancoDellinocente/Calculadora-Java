/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contorlador;

import Modelo.Modelo;
import Vista.Ventana;

/**
 *
 * @author franc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Ventana vista = new Ventana();
        Controlador controlador = new Controlador( vista , modelo );
    }
    
}
