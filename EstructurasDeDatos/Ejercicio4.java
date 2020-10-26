import java.util.Scanner;

class Ejercicio4{

    public void Ejer4() {
       
        Scanner  entrada=new Scanner(System.in);
        int positivo=0;
        int negativo=0;
        int numeros=0;
        int numero;
        int i;
        char dec;
        do{
            System.out.println("¿Cuántos numeros deseas ingresar?");
            numeros=entrada.nextInt();
            for(i=numeros;i>=1;i--){
            
                System.out.println("Ingresa un numero");
                numero=entrada.nextInt();
            
                if(numero>0){
                    positivo++;
                }else{
                    negativo++;
                }

            }
            System.out.println("Hay un total de:"+positivo+" numeros positivos");
            System.out.println("Hay un total de:"+negativo+" numeros negativos");
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");

            dec=entrada.next().charAt(0);
       }while(dec =='s');   
    }
}