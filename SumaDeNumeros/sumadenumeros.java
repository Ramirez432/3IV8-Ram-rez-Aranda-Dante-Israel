import java.util.Scanner;

class sumadenumeros{

    public static void main(String[] args ){

        Scanner entrada=new Scanner(System.in);
do{
        int num1,num2,resultado;
        while(num1<0){
        System.out.println("Ingresa el primer numero");
        num1=entrada.nextInt();
    
    }
    while(num2<0){
        System.out.println("Ingresa el segundo numero");
        num2=entrada.nextInt();
        resultado=num1+num2;

    }
   resultado=resultado+num1;
        }while(num1!=0);
    System.out.println("La suma es de: "+resultado);
    }
}