/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;
import examen.Inter;

/**
 *
 * @author israr
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Menu extends JFrame implements ActionListener{
    JButton inicio,ges;
    public Menu(){
        setSize(500,240);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Inicio");
        componentes();
    }
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
       panel.setBackground(Color.RED);
        this.getContentPane().add(panel);
        
        inicio=new JButton("Usuario");
        inicio.setBounds(100,110,100,20);
        panel.add(inicio); 
        inicio.addActionListener(this);
 
        ges=new JButton("Registrar");
        ges.setBounds(300,110,100 ,20);
        panel.add(ges);
        ges.addActionListener(this);

        
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==inicio) {
            
            Ahorcado obj = new Ahorcado();
            obj.setVisible(true);
            this.setVisible(false);       
        }
         if (e.getSource()==ges) {
            
            Inter ad= new Inter();
            ad.setVisible(true);
            this.setVisible(false);       
        }
    }
}
