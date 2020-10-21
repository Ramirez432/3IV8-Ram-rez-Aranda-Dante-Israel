import java.util.Scanner;

class Ejercicio1{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
       int edad;
       String respuesta=si,no;
       System.out.printl("Ingresa tu edad");
       edad=entrada.nextInt();
       if(edad>65){
        System.out.printl("Tu descuento sera de 40%");
       }
       if(edad<21){
        System.out.printl("¿Tus papás son miembros?");
        respuesta=entrada.nextLine();
        if(respuesta==si){
            System.out.printl("Tu descuento sera de 45%");



        }else{
            System.out.printl("Tu descuento sera de 25%");

        }
       }

    }
}