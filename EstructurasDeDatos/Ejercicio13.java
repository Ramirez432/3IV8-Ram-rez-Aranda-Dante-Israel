import java.util.Scanner;

class Ejercicio13{
    public void Ejer13(){
        double numero1,numero2,suma,resta,multi,div;
        char dec;
        Scanner entrada=new Scanner(System.in);
        int operacion;
        do{
            System.out.println("Ingresa un numero");
            numero1=entrada.nextDouble();
            System.out.println("¿Qué operacion deseas realizar?");
            System.out.println("1. suma");
            System.out.println("2.division");
            System.out.println("3.resta");
            System.out.println("4. multiplicacion");
            operacion=entrada.nextInt();
            System.out.println("Ingresa un numero");
            numero2=entrada.nextDouble();
            switch (operacion) {
                case 1:
                    suma=numero1+numero2;
                    System.out.println(suma);
                    break;
                case 2:
                    div=numero1/numero2;
                    System.out.println(div);
                    break;            
                case 3:
                    resta=numero1-numero2;
                    System.out.println(resta);
                    break;
                case 4:
                    multi=numero1*numero2;
                    System.out.println(multi);
                    break;
                    default:
                    break;
            }
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");

            dec=entrada.next().charAt(0);
        }while(dec =='s');
    }
}