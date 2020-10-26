import java.util.Scanner;

class Ejercicio6{

    /*crear programa para elegir calcular area, perimetro
    de las siguientes figuras
    triangulo
    circulo
    cuadrado
    rectangulo
    perimetro
    pentagono
    */
    public void Ejer6() {
        
        Scanner entrada=new Scanner(System.in);
        int base, altura,opcion,lado1,lado2,apotema;
        double resultadoa, resultadop,volumen,radio;
        char dec;
        //cuerpoo
        do{
            System.out.println("Elija la opcion deseada:");
            System.out.println("1.Calcular el area y el perimetro de un cuadrado");
            System.out.println("2.Calcular el area y el perimetro  de un triangulo");
            System.out.println("3.Calcular el volumen de una esfera");
            System.out.println("4.Calcular el volumen de un cilindro");
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
                        System.out.println("Ingresa el radio de la esfera");
                        radio=entrada.nextDouble();
                        volumen=(4*3.1416*radio*radio*radio)/3;
                        System.out.println("El volumen de la esfera es:"+volumen);
                    break;
                case 4:
                    System.out.println("Ingresa el radio del cilindro");
                    radio=entrada.nextDouble();
                    System.out.println("Ingresa la altura");
                    altura=entrada.nextInt();
                    volumen=3.1416*radio*radio*altura;
                    System.out.println("El volumen del cilindro es:"+volumen);
            
                break;
            
                default:
                    System.out.println("Gracias");
                break;
            }
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
            dec=entrada.next().charAt(0);
        }while(dec =='s');
            
       
    }
}