import java.util.Scanner;

class Ejercicio3{

    public void Ejer3() {
       
        Scanner  entrada=new Scanner(System.in);
        int opcion;
        char dec;
        double temperatura,conversion;
        
        do{
            System.out.println("¿Con que deseas trabajar?");
        System.out.println("1.Grados Fahrenheit");
        System.out.println("2. Grados Celsius");
        System.out.println("3.Grados Kelvine");
        System.out.println("4.Grados Rankie");
        opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("Ingresa la temperatura");
                temperatura=entrada.nextDouble();
                System.out.println("¿A qué deseas convertir?");
                System.out.println("1. Grados Celsius");
                System.out.println("2.Grados Kelvine");
                System.out.println("3.Grados Rankine");
                opcion=entrada.nextInt();

                switch (opcion) {
                    case 1:
                        conversion=(temperatura-32)/1.8000;
                        System.out.println("El resultado es:"+conversion+" grados Celsius");

                        break;
                    case 2:
                    conversion=(temperatura-32)/1.8000+273.15;
                    System.out.println("El resultado es:"+conversion+" grados Kelvin");
                        break;
                    case 3:
                        conversion=(temperatura-32)+491.67;
                        System.out.println("El resultado es:"+conversion+" grados Rankie");
                        break;                        
                    default:
                        break;
                }
                case 2:
                System.out.println("Ingresa la temperatura");
                temperatura=entrada.nextDouble();
                System.out.println("¿A qué deseas convertir?");
                System.out.println("1. Grados Fahrenheit");
                System.out.println("2.Grados Kelvine");
                System.out.println("3.Grados Rankine");
                opcion=entrada.nextInt();

                switch (opcion) {
                    case 1:
                        conversion=(temperatura*1.8000)+32;
                        System.out.println("El resultado es:"+conversion+" grados Fahrenheit");

                        break;
                    case 2:
                    conversion=temperatura+273.15;
                    System.out.println("El resultado es:"+conversion+" grados Kelvin");
                        break;
                    case 3:
                        conversion=(temperatura*1.8000)+491.67;
                        System.out.println("El resultado es:"+conversion+" grados Rankie");
                        break;                        
                    default:
                        break;
                }
                case 3:
                System.out.println("Ingresa la temperatura");
                temperatura=entrada.nextDouble();
                System.out.println("¿A qué deseas convertir?");
                System.out.println("1. Grados Celsius");
                System.out.println("2.Grados Fahrenheit");
                System.out.println("3.Grados Rankine");
                opcion=entrada.nextInt();

                switch (opcion) {
                    case 1:
                        conversion=(temperatura-273.15);
                        System.out.println("El resultado es:"+conversion+" grados Celsius");

                        break;
                    case 2:
                    conversion=(temperatura-273.15)*1.8000+32;
                    System.out.println("El resultado es:"+conversion+" grados Fahrenheit");
                        break;
                    case 3:
                        conversion=(temperatura-273.15)*1.8000+491.67;
                        System.out.println("El resultado es:"+conversion+" grados Rankie");
                        break;                        
                    default:
                        break;
                }
                case 4:
                System.out.println("Ingresa la temperatura");
                temperatura=entrada.nextDouble();
                System.out.println("¿A qué deseas convertir?");
                System.out.println("1. Grados Celsius");
                System.out.println("2.Grados Fahrenheit");
                System.out.println("3.Grados Kelvin");
                opcion=entrada.nextInt();

                switch (opcion) {
                    case 1:
                        conversion=(temperatura-491.67)/1.8000;
                        System.out.println("El resultado es:"+conversion+" grados Celsius");

                        break;
                    case 2:
                    conversion=(temperatura-491.67)+32;
                    System.out.println("El resultado es:"+conversion+" grados Fahrenheit");
                        break;
                    case 3:
                        conversion=(temperatura-491.67)/1.8000+273.15;
                        System.out.println("El resultado es:"+conversion+" grados Kelvin");
                        break;                        
                    default:
                        break;
                }
               
            }
            
           
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
            dec=entrada.next().charAt(0);
       }while(dec =='s');   
    }
}