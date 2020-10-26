import java.util.Scanner;

class Menu{

   
    public static void main(String[]args) {
        
        Scanner entrada=new Scanner(System.in);
        int opcion;
        char dec;
        //cuerpoo
        do{
            System.out.println("3IV8 Ramírez Aranda Dante Israel");
            System.out.println("Elija la opcion deseada:");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Ejercicio 4");
            System.out.println("5.Ejercicio 5");
            System.out.println("6.Ejercicio 6");
            System.out.println("7.Ejercicio 7");
            System.out.println("8.Ejercicio 8");
            System.out.println("13.Ejercicio 13");
            System.out.println("14.Salir");
       
            opcion=entrada.nextInt();
        //segun
            switch (opcion) {
                case 1:
                    Ejercicio1 obj=new Ejercicio1();
                    obj.Ejer1();
                    break;
                case 2:
                    Ejercicio2 dos=new Ejercicio2();
                    dos.Ejer2();                   

                    break;
                case 3:
                    Ejercicio3 tres=new Ejercicio3();
                    tres.Ejer3();   
                    break;
                case 4:
                    Ejercicio4 cuatro=new Ejercicio4();
                    cuatro.Ejer4();
                    break;
                case 5:
                    Ejercicio5 cinco=new Ejercicio5();
                    cinco.Ejer5();
                    break;
                case 6:
                    Ejercicio6 seis=new Ejercicio6();
                    seis.Ejer6();
                    break;
                case 7:
                    Ejercicio7 siete=new Ejercicio7();
                    siete.Ejer7();
                    break;
                case 8:
                    Ejercicio8 ocho=new Ejercicio8();
                    ocho.Ejer8();
                    break;
                case 13:
                    Ejercicio13 trece=new Ejercicio13();
                    trece.Ejer13();
                    break;
                default:
                    System.out.println("Gracias");
                    break;
            }
                System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
                dec=entrada.next().charAt(0);
        }while(dec =='s');
            
       
    }
}