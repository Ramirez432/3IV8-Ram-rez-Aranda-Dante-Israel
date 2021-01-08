/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author israr
 */

import java.util.*;
import java.io.*;

public class ListaPersonas implements Serializable{

    /**
     * @param args the command line arguments
     */
    public  void Serial(){
        // TODO code application logic here
        //CRUD
        Scanner leer = new Scanner(System.in);
        //un objeto de libros
        Gente objlista = new Gente();       
        int opcion;
       
        do{
            
            System.out.println("Bienvenidos al CRUD de la Biblio");
            System.out.println("Elija la opcion deseada");
            System.out.println("1.- Agregar un nuevo usuario");
            System.out.println("2.- Consultar usuario");
            System.out.println("3.- Consultar todos los usuarios");
            System.out.println("4.- Borrar un usuario");
            System.out.println("5.- Modificar un usuario");
            System.out.println("6.- Salir");
            
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    objlista.agregarPersona();
                    
                    break;
                case 2:
                    objlista.buscar();
                    
                    break;    
                case 3:
                    objlista.consultaGral();
                    
                    break;
                case 4:
                    objlista.borrar();
                    
                    break;
                case 5:
                    objlista.modificar();
                    
                    break;
                case 6:
                    System.out.println("Se genera el archivo al salir");
                    objlista.grabar();
                    break;
                default:
                    System.out.println("Error");
            }
        
        }while((opcion>=1) && (opcion<6));
        
    }
    
}