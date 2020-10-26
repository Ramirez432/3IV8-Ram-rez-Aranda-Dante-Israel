import java.util.Scanner;

public class Ejercicio1{
    
   
    public void Ejer1(){
     Scanner entrada=new Scanner(System.in);
       int edad;
       char dec;
       String respuesta="";
        do{
            System.out.println("Ingresa tu edad");
            edad=entrada.nextInt();
            if(edad>65 && edad<103){
                System.out.println("Tu descuento sera de 40%");
            }
            if(edad<21){
                System.out.println("¿Tus papás son miembros?");
                respuesta=entrada.next();
                if(respuesta.equals("si")){
                    System.out.println("Tu descuento sera de 45% ");

                }else{
                    System.out.println("Tu descuento sera de 25% ");

                }
            }
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
            dec=entrada.next().charAt(0);
        }while(dec =='s');   
    }


   
}