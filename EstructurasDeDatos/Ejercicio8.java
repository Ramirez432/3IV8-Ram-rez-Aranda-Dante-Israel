import java.util.Scanner;

class Ejercicio8{

    Scanner entrada=new Scanner(System.in);
        char dec;
        int numero;
    public void Ejer8() {
        
       
        //cuerpoo
        do{
            System.out.println("Ingresa el numero");
            numero=entrada.nextInt();
            if(numero>0){
            
                System.out.println("El factorial del numero "+numero+" es "+factorial(numero));
            
            }else{
                System.out.println("Por favor ingresa un numero positivo");
            
            }
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
                dec=entrada.next().charAt(0);
            
        }while(dec =='s');       
    }
    public static int factorial(int numero) {
        int factorial=1;
        for(int i=1;i<=numero;i++){
            factorial=factorial*i;
        }        
         return factorial;
    }
}       