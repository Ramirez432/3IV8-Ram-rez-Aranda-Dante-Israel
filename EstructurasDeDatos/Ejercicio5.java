import java.util.Scanner;

class Ejercicio5{
    public void Ejer5(){
        Scanner entrada=new Scanner(System.in);
        int pan=0,leche=0,galletas=0,papas=0,chocolates=0;
        char dec;
        double preciopan=4.20,pleche=16.40,pgalletas=13.50,ppapas=11,pchocolates=12.23,rp,rl,rg,rpa,rc,preciof,cantidad;
        do{
            System.out.println("¿Cuantas cantidades de pan comprara?");
            pan=entrada.nextInt();
            System.out.println("¿Cuantos litros de leche comprara?");
            leche=entrada.nextInt();

            System.out.println("¿Cuantos paquetes de galletas comprara?");
            galletas=entrada.nextInt();

            System.out.println("¿Cuantas bolsas de papas comprara?");
            papas=entrada.nextInt();
            System.out.println("¿Cuantas barras de chocolate comprara?");
            chocolates=entrada.nextInt();
            rp=preciopan*pan;
            rl=pleche*leche;
            rg=pgalletas*galletas;
            rpa=ppapas*papas;
            rc=pchocolates*chocolates;
            preciof=rp+rl+rg+rpa+rc;
            cantidad=pan+galletas+leche+papas+chocolates;
            System.out.println("Pan:"+pan);
            System.out.println("Leche:"+leche);
            System.out.println("Galletas"+galletas);
            System.out.println("Papas:"+papas);
            System.out.println("Chocolates"+chocolates);
            System.out.println("Cantidad de pruductos final:"+cantidad);
            System.out.println("Debe pagar:$"+preciof);
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s, si deseas regresar al menu escribe una letra diferente a s");
            dec=entrada.next().charAt(0);
        }while(dec =='s');

        

    }
}