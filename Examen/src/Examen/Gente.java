/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author israr
 */
public class Gente implements Serializable{
    
    private ArrayList<Persona> listaPersona;
    
    //mandar a llamar a mis archivos
    private ArchivoP objarchivo = new ArchivoP();
    
    
    public Gente(){
        //voy a inicializar los dos objetos privados
        listaPersona = new ArrayList<>();
        //sobrecargar el objeto
        listaPersona = objarchivo.leer();
    }
    
    //ya viene el CRUD
    
    public void agregarPersona(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            
            //objeto del cat de libros
            Persona obj = new Persona();
            obj.aceptaDatos();
            //lo agregamos al array
            listaPersona.add(obj);
            JOptionPane.showMessageDialog(null,"Usuario agregado gracias");
            resp=JOptionPane.showInputDialog("¿Desea agregar otro usuario? (s/n)").charAt(0);
            
        }
    }
    
    public void consultaGral(){
        //primero debo de saber si la lista esta vacia
        if(listaPersona.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay usuarios registrados");
        }else{
            System.out.println("Los usuarios son:\n");
            //debemos recorrer el arreglo
            for(int i = 0; i<listaPersona.size(); i++){
                JOptionPane.showMessageDialog(null,"iD: " + listaPersona.get(i).getId()+ "\n"
                                 + "Apellidos: " + listaPersona.get(i).getApellidos()+ "\n"
                                 + "Nombre: " + listaPersona.get(i).getNombre()+ "\n"
                                 + "Edad: " + listaPersona.get(i).getEdad()+ "\n");
            }
            
        }
    }
    
    
    /*para poder hacer el metodo de busqueda del libro por su id
    o por su nombre o por su editorial, o lo que quieran
    primero debemos de obtener un elemento para identificarlo y traerlo de 
    la posicion donde esta almacenado en el arreglo*/
    
    
    private int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista del array
        for(int i = 0; i < listaPersona.size(); i++){
            if(nombreBuscar.equals(listaPersona.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
                JOptionPane.showMessageDialog(null,"Persona no encontrado");
            }
        }
        if(!existe){
            JOptionPane.showMessageDialog(null,"No existe el registro");
            pos = -1;
        }
        return pos;
    }
    
    //metodo para buscar
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;        
        nombreBusca=JOptionPane.showInputDialog("Ingresa el nombre");
        //puedo ocupar mi metodo para buscarlo a partir de la posicion
        posBuscando = traePosicion(nombreBusca);
        
        //mando imprimir
       JOptionPane.showMessageDialog(null,"Apellidos: " + listaPersona.get(posBuscando).getApellidos()+"\nNombre: " + listaPersona.get(posBuscando).getNombre()+"\nEdad: " + listaPersona.get(posBuscando).getId());
        
        return posBuscando;
    }
    
    //vamos a borrar
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroBorrar;
        int posBorrar;
        
        //lo primero que necesito es saber si la lista esta vacia
        if(listaPersona.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay peraonaa registrados");
        }else{
            //si hay algo
            System.out.println("Eleccion para borrar");
            posBorrar = buscar();
            //aqui ya me mostro los datos del libro antes de borrarlo
            if(posBorrar < listaPersona.size()){
                listaPersona.remove(posBorrar);
                JOptionPane.showMessageDialog(null,"Usuario Borrado correctamente");
            }
        }
    }
    
    //modificar
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "s";
        Scanner entrada = new Scanner(System.in);
        
        nombreModificar=JOptionPane.showInputDialog("Ingresa el nombre");

        
        //necesito un bucle para repita el proceso
        while("s".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            //verificando que la lista no este vacia
            if(posModificar <= 0);
            
            //cuando no esta vacia
            resMods=Integer.parseInt(JOptionPane.showInputDialog("1.- Apellidos\n2.- Nombre\n3.- Edad"));
                
            
                
                switch (resMods) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"El Apellido es: "+listaPersona.get(posModificar).getApellidos() + "\nIngresa el nuevo apellido: ");
                        //tengo que enviar el nuevo dato
                        listaPersona.get(posModificar).setApellidos(entrada.next());
                        JOptionPane.showMessageDialog(null,"El dato a sido modificado");
                        //el nuevo dato es
                        JOptionPane.showMessageDialog(null,"Apellido: " + listaPersona.get(posModificar).getApellidos());
                        
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null,"El nombre es: "+listaPersona.get(posModificar).getNombre()+ "\nIngresa el nuevo nombre: ");
                        //tengo que enviar el nuevo dato
                        listaPersona.get(posModificar).setNombre(entrada.next());
                        JOptionPane.showMessageDialog(null,"El dato a sido modificado");
                        //el nuevo dato es
                        JOptionPane.showMessageDialog(null,"nombre: " + listaPersona.get(posModificar).getNombre());
                        
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null,"La edad es: "+listaPersona.get(posModificar).getEdad()+ "\nIngresa el nuevo precio: ");
                        //tengo que enviar el nuevo dato
                        listaPersona.get(posModificar).setEdad(entrada.nextInt());
                        JOptionPane.showMessageDialog(null,"El dato a sido modificado");
                        //el nuevo dato es
                        JOptionPane.showMessageDialog(null,"Precio: " + listaPersona.get(posModificar).getEdad());
                        
                        break;
                    
                }
                
                JOptionPane.showMessageDialog(null,"¿Quieres cambiar mas datos?");
                opcion = entrada.nextLine();
            
        }
    }

    public ArrayList<Persona> getListalibros() {
        return listaPersona;
    }

    public void setListalibros(ArrayList<Persona> listalibros) {
        this.listaPersona =listaPersona;
    }

    public ArchivoP getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(ArchivoP objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    //el metodo que se encarga de grabar los datos
    public void grabar(){
        getObjarchivo().serializar(listaPersona);
    }
    
}