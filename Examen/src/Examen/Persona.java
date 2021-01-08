/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author israr
 */
public class Persona implements Serializable {
    
   private int id;
   private String apellidos;
   private String nombre;
   private int edad;
    
    public Persona(){
    
    }

    public Persona(int id, String apellidos, String nombre, int edad) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

public void aceptaDatos(){
    
        Scanner entrada = new Scanner(System.in);
        id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID"));
        apellidos=JOptionPane.showInputDialog("Ingresa los apellidos");
       nombre=JOptionPane.showInputDialog("Ingresa el nombre");
       edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));

    }    
    

}