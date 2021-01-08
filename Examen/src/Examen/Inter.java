package examen;

import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 *
 * @author israr
 */
public class Inter extends JFrame implements ActionListener{
    Persona libro = new Persona();
    Gente datos= new Gente();
    JButton agregar,consultar,consultarT,modificar,salir,regresar,borrar;
    
    

     public Inter(){
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("admin");
        componentes();
     }
      private void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(panel);
     
        JLabel me=new JLabel("CRUD");
        me.setFont(new Font("arial",Font.PLAIN, 40));
        me.setBounds(160, 0, 200, 80);
        panel.add(me);
        
        agregar = new JButton("Agregar Libro");
        agregar.setBounds(40, 70, 120,60);
        panel.add(agregar);
        agregar.addActionListener(this);
        
        consultar = new JButton("consultar Libro");
        consultar.setBounds(40, 200, 120,60);
        panel.add(consultar);
        consultar.addActionListener(this);
        
        modificar = new JButton("Modificar Libro");
        modificar.setBounds(300, 70, 120,60);
        panel.add(modificar);
        modificar.addActionListener(this);
        
        consultarT = new JButton("Consultar Libros");
        consultarT.setBounds(300, 200, 150,60);
        panel.add(consultarT);
        consultarT.addActionListener(this);
        
        borrar = new JButton("Borrar");
        borrar.setBounds(180, 140, 90,40);
        panel.add(borrar);
        borrar.addActionListener(this);
        
        regresar = new JButton("Regresar");
        regresar.setBounds(310, 270, 90,40);
        panel.add(regresar);
        regresar.addActionListener(this);
        
        salir = new JButton("Salir");
        salir.setBounds(420, 270, 70,40);
        panel.add(salir);
        salir.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==salir) {
            System.exit(0);
        }
        if (e.getSource()==regresar) {
            Menu obj = new Menu();
            obj.setVisible(true);
            this.setVisible(false);
        }
        if (e.getSource()==agregar) {
            datos.agregarPersona();
        }
        if (e.getSource()==consultar) {
            datos.buscar();
        }
        if (e.getSource()==borrar) {
            datos.borrar();
        }
        if (e.getSource()==modificar) {
            datos.modificar();
        }
        if (e.getSource()==consultarT) {
            datos.consultaGral();
        }
    }
}