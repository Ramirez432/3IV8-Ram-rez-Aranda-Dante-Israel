import java.util.Scanner;

public class Menu{
     
    int numero;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char dec;
        int opcion;
        do{
            System.out.println("Elija la opcion deseada:");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.Salir");    
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    Menu n=new Menu();
                    n.Ejercicio1();
                break;
                case 2:
                    Menu no=new Menu();
                    no.Ejercicio2();
                break;
                case 3:
                    Menu ow=new Menu();
                    ow.Ejercicio3();
                break;
                case 4:
                    Menu w=new Menu();
                    w.Ejercicio4();
                break;
                default:
                    System.out.println("Gracias");
                break;
            }
                System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
                dec=entrada.next().charAt(0);
        }while(dec =='s');

    }

    public void Ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        double promediop=0,promedion=0,sumap=0,suman=0;
        int numero []=new int[10];
        int posi=0,nega=0;
        for(int i=0;i<=9;i++){
            System.out.println(i+1+".Ingresa un numero");
            numero[i]=entrada.nextInt();
            if(numero[i]<0){
                suman+=numero[i];
                nega++;   
            }
            if(numero[i]>0){
                sumap+=numero[i];
                posi++;
            }
        }
        promedion=suman/nega;
        promediop=sumap/posi;
        System.out.println("El promedio de positivos es: "+promediop);
        System.out.println("El promedio de negativos es: "+promedion);
    }

    public void Ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        int i;
        double promedio=0,resultadopromedio=0;
        int numero []=new int[10];
        for(i=0;i<=9;i++){
            System.out.println(i+1+".Ingresa un numero");
            numero[i]=entrada.nextInt();
        }
        for(i=0;i<9;i++){
            if(i%2==0){//saltar de 2 en 2 desde la posicion 0
                promedio=promedio+numero[i];
            }
        }
        resultadopromedio=promedio/5;
        System.out.println("Promedio de posiciones pares "+resultadopromedio);
    }

    public void Ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        double promedio=0,sumap=0;
        int numero []=new int[10];
        int aprobo=0,reprobo=0;
        for(int i=0;i<=9;i++){
            System.out.println(i+1+".Ingresa la calificacion");
            numero[i]=entrada.nextInt();
            if(numero[i]>=6){
                aprobo++;
            }else{
                reprobo++;
            }
            promedio=promedio+numero[i];
            sumap=promedio/10;
        }
        System.out.println("");
        for(int j:numero){
            System.out.println(j);
        }  
        System.out.println("");       
        System.out.println("Promedio:"+promedio);
        System.out.println("Alumnos aprobados "+aprobo);
        System.out.println("Alumnos reprobados "+reprobo);
    }

    public void Ejercicio4(){
        Scanner entrada=new Scanner(System.in);
        int array1[][]=new int[3][3];
        int array2[][]=new int[3][3];
        int array3[][]=new int[3][3];
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                System.out.println("Ingresa el numero de la posicion "+(i)+","+(j)+" de la primera matriz");
                array1[i][j]=entrada.nextInt();   
            } 
        }    
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2.length;j++){
                System.out.println("Ingresa el numero de la posicion "+(i)+","+(j)+" de la segunda matriz");
                array2[i][j]=entrada.nextInt();   
            } 
        }
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                 array3[i][j] = array1[i][j] +array2[i][j];
            }
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print("[ "+array3[i][j]+" ]");
            }
            System.out.println("");
        }     
    }
}