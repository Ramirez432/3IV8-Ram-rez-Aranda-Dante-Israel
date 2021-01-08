/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author israr
 */
public class Ahorcado extends JFrame implements ActionListener{
        JPanel panel;
        JTextField palabra,g;
        JLabel i1,i2,i3,i4;
        JButton correcto,generar, regresar;
        int dato1,score=0,dato2; 
        String cadenavacia,p;
        String lista = "PERRO DISCO MONITOR";
        Random azar = new Random();
        //genera numero al azar de la cadena
    public Ahorcado(){
        setSize(800,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Menu de Juego");
        componentes();
        
    }
    private void componentes(){
         panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        this.getContentPane().add(panel);
        
        JLabel pa=new JLabel("Ingresa la palabra a adivinar");
        pa.setBounds(10, 170, 200, 30);
        panel.add(pa);
       
        JLabel ad=new JLabel("Palabra a adivinar");
        ad.setBounds(10, 130, 200, 30);
        panel.add(ad);
        
        i1=new JLabel("-Presiona el boton GENERAR para obtener una palabra aleatoria.");
        i1.setBounds(10, 20, 370, 20);
        panel.add(i1);
        
        i2=new JLabel("-Ingresa solo letras MAYUSCULAS");
        i2.setBounds(10, 42, 370, 20);
        panel.add(i2);
        
        i3=new JLabel("-Para comprobar si la palabra es correcta presiona el boton COMPROBAR");
        i3.setBounds(10, 70, 420, 20);
        panel.add(i3);
        
        i1=new JLabel("-Cuentas con un solo intento, Suerte");
        i1.setBounds(10, 91, 370,20);
        panel.add(i1);
      
        
        palabra=new JTextField(20);
        palabra.setBounds(190, 170, 100, 30);
        panel.add(palabra);
         
        correcto= new JButton("Comprobar");
        correcto.setBounds(660, 270, 100, 20);
        panel.add(correcto);
        correcto.addActionListener(this);
         
        generar=new JButton("Generar palabra");
        generar.setBounds(300, 270, 150, 20);
        panel.add(generar);
        generar.addActionListener(this);
        
        regresar=new JButton("Regresar");
        regresar.setBounds(40, 270, 100, 20);
        panel.add(regresar);
        regresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==generar){
            Pala();
            generar.setVisible(false);
        }
        if(e.getSource()==correcto){
            if(palabra.getText().equals(cadenavacia)){
                score=100;
                JOptionPane.showMessageDialog(null,"Felicidades descubriste la palabra"
                        + "\nTu puntacion es de "+score);
                Menu r=new Menu();
                r.setVisible(true);
                
                Ahorcado f=new Ahorcado();
                f.setVisible(false);
               
            }else{
                score=0;
                a3();
                JOptionPane.showMessageDialog(null,"Fallaste la palabra era "+cadenavacia
                                                    +"\nTu puntuacion es de "+score);
                 Menu r=new Menu();
                r.setVisible(true);
            }
        }
    }
    
    public void a3(){
        JOptionPane.showMessageDialog(null," ---------------------"
                    +"\n|                     |"
                    +"\n|                     |"
                    +"\n|                  -------"
                    +"\n|                 | X  X  |"
                    +"\n|                 |   o   |"
                    +"\n|                  -------"
                    +"\n|                     |   "
                    +"\n|                   / | \\ "
                    +"\n|                  /  |   \\ "
                    +"\n|                 /   |     \\ "
                    +"\n|                     |   "
                    +"\n|                    / \\"
                    +"\n|                   /   \\  "
                    +"\n|                  /     \\ ");   
    }
    
    public void Pala(){
        dato1 = azar.nextInt(lista.length());
        // Verifica la posicion si es espacio vacio o letra
        if(lista.charAt(dato1) == ' ')
        {
            dato2 = ++dato1;
        }
        else
        {
            dato2 = dato1;
 
            while(dato1 - 1 >= 0 && lista.charAt(dato1 - 1) != ' ')
                dato1--;
        }
 
       // Ubica el final de la palabra
        while((dato2 + 1) <= lista.length())
        {
            if(lista.charAt(dato2) != ' ')
                dato2++;
            else
                break;
        }
 
        cadenavacia = lista.substring(dato1, dato2);
        if(cadenavacia.equals("PERRO")){
            p="P_RR_";
        }
        if(cadenavacia.equals("MONITOR")){
            p="M_NIT_ _";
        }
        if(cadenavacia.equals("DISCO")){
            p="D_S_O";
        }
       JTextField g=new JTextField(p);
       g.setBounds(140,130 , 100, 20);
       panel.add(g);
    }
    
}
