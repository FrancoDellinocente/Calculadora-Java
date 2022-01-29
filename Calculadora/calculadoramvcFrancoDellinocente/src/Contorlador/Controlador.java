/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contorlador;

import Modelo.Modelo;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Controlador implements ActionListener{
    public Ventana v1;
    public Modelo m1;
    
    public Controlador(Ventana v1, Modelo m1) {
        
        this.m1 = m1;
        this.v1 = v1;
        
        v1.setVisible(true);
        
        this.v1.getjB_Suma().addActionListener(this);
        this.v1.getjB_Resta().addActionListener(this);
        this.v1.getjB_Multi().addActionListener(this);
        this.v1.getjB_Division().addActionListener(this);
        
    }
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(this.m1.ValidaDato(this.v1.getjT1().getText()) && this.m1.ValidaDato(this.v1.getjT2().getText())){
         if(e.getSource().equals(this.v1.getjB_Suma())){
            this.v1.getjT_Resul().setText(String.valueOf(this.m1.Suma(Double.parseDouble(this.v1.getjT1().getText()), Double.parseDouble(this.v1.getjT2().getText()))));
         }
         else if(e.getSource().equals(this.v1.getjB_Resta())){
           this.v1.getjT_Resul().setText(String.valueOf(this.m1.Resta(Double.parseDouble(this.v1.getjT1().getText()), Double.parseDouble(this.v1.getjT2().getText()))));   
         }
         else if(e.getSource().equals(this.v1.getjB_Multi())){
           this.v1.getjT_Resul().setText(String.valueOf(this.m1.Multiplicacion(Double.parseDouble(this.v1.getjT1().getText()), Double.parseDouble(this.v1.getjT2().getText()))));   
         }
         else if(e.getSource().equals(this.v1.getjB_Division())){
           this.v1.getjT_Resul().setText(String.valueOf(this.m1.Division(Double.parseDouble(this.v1.getjT1().getText()), Double.parseDouble(this.v1.getjT2().getText()))));   
         }
      }
      else{
           JOptionPane.showMessageDialog(null, "DEBE INGRESAR SOLO NUMEROS");
      }

    }
}
