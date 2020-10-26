import java.util.Scanner;

class Ejercicio2{

    public void Ejer2() {
        int residuo=0;
        char dec;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero decimal");
            String numero=entrada.nextLine();
            int cociente=Integer.parseInt(numero);
            while(cociente!=0){
            residuo=cociente%2;
            cociente=cociente/2;
            System.out.println(residuo);  
        
            }
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
            dec=entrada.next().charAt(0);
        }while(dec =='s');
    }
}
   
 