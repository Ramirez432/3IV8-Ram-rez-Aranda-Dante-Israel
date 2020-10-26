import java.util.Scanner;

class Ejercicio7{


    public void Ejer7() {
        
        Scanner entrada=new Scanner(System.in);
        int opcion;
        char dec;
        //cuerpoo
        do{
            System.out.println("\tN\t\t\t");
            System.out.println("\t1\t10\t100\t1000");
            System.out.println("\t2\t20\t200\t2000");
            System.out.println("\t3\t30\t300\t3000");
            System.out.println("\t4\t40\t400\t4000");
            System.out.println("\t5\t50\t500\t5000");
            System.out.println("\t6\t60\t600\t6000");
            System.out.println("\t7\t70\t700\t7000");
            System.out.println("\t8\t80\t800\t8000");
            System.out.println("\t9\t90\t900\t9000");
       

            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
            dec=entrada.next().charAt(0);
        }while(dec =='s');
            
    
    }
}