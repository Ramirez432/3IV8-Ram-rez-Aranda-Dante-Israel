import java.util.Scanner;
class figurasClasico{

    /*crear programa para elegir calcular area, perimetro
    de las siguientes figuras
    triangulo
    circulo
    cuadrado
    rectangulo
    perimetro
    pentagono
    */
    public static void main(String[]args) {
        
        Scanner entrada=new Scanner(System.in);
        int base, altura,opcion,lado1,lado2,apotema;
        double resultadoa, resultadop;
        char dec;
        //cuerpoo
        do{
        System.out.println("Elija la opcion deseada:");
        System.out.println("1.Calcular el area y el perimetro de un cuadrado");
        System.out.println("2.Calcular el area y el perimetro  de un triangulo");
        System.out.println("3.Calcular el area y el perimetro  de un circulo");
        System.out.println("4.Calcular el area y el perimetro  de un rectangulo");
        System.out.println("5.Calcular el area y el perimetro  de un pentagono");
        System.out.println("6.Salir");

        opcion=entrada.nextInt();
        //segun
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el valor del lado");
                base=entrada.nextInt();

                resultadoa=base*base;
                resultadop=base*4;
                System.out.println("El area del cuadrado es:"+resultadoa);
                System.out.println("El perimetro del cuadrado es:"+resultadop);

            break;
             case 2:
                    System.out.println("Ingresa el valor de la base");
                    base=entrada.nextInt();
                    System.out.println("Ingresa el valor del segundo lado");
                    lado1=entrada.nextInt();
                    System.out.println("Ingresa el valor del tercer lado");
                    lado2=entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura=entrada.nextInt();
                    resultadoa=(base*altura)/2;
                    resultadop=base+lado1+lado2;
                    System.out.println("El area del triangulo es:"+resultadoa);
                    System.out.println("El perimetro del triangulo es:"+resultadop);

            break;
            case 3:
                System.out.println("Ingresa el valor del radio");
                base=entrada.nextInt();
            
                resultadoa=3.1416*base*base;
                resultadop=(3.1416*2)*base;
                System.out.println("El area del circulo es:"+resultadoa);
                System.out.println("El perimetro del circulo es:"+resultadop);

            break;
            case 4:
                System.out.println("Ingresa el valor de la base");
                base=entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura=entrada.nextInt();
                resultadop=(base*2)+(altura*2);
                resultadoa=base*altura;
                System.out.println("El area del rectangulo es:"+resultadoa);
                System.out.println("El perimetro del rectangulo es:"+resultadop);
            break;
            case 5:
            System.out.println("Ingresa el valor del apotema");
            apotema=entrada.nextInt();
            System.out.println("Ingresa el valor de un lado");
            lado1=entrada.nextInt();
            resultadop=5*lado1;
            resultadoa=(resultadop*apotema)/2;
            System.out.println("El area del pentagono es:"+resultadoa);
                System.out.println("El perimetro del pentagono es:"+resultadop);
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