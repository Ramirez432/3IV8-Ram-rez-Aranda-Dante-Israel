import javax.swing.JOptionPane;
public class Figuras{
    //variables universales
    private double pr,ar,lado1,resultadoa,resultadop;
    private double base,altura,lado2;
    public void F(){
        JOptionPane.showMessageDialog(null,"Elija la opcion deseada:");
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("1.Calcular el area y el perimetro de un cuadrado\n2.Calcular el area y el perimetro  de un triangulo\n3.Calcular el area y el perimetro  de un circulo\n4.Calcular el area y el perimetro  de un rectangulo"));
        switch (opcion){
            case 1:
            //pide datos y llama los datos de los metodos
             lado1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                resultadop=cuadradop(lado1);
                resultadoa=cuadradoa(lado1);
                JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+resultadoa+"\nEl perimetro es: "+resultadop);
                break;    
            case 2:
                lado1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1"));
                lado2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado"));
                base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));
                altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
                resultadop=triangulop(lado1,lado2,base);
                resultadoa=trianguloa(base,altura);
                JOptionPane.showMessageDialog(null,"El area es: "+resultadoa+"\nEl perimetro es: "+resultadop);
                break;    
            case 3:
                base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
                resultadoa=circuloa(base);
                resultadop=circulop(base);
                JOptionPane.showMessageDialog(null,"El area es: "+resultadoa+"\nEl perimetro es: "+resultadop);
                break;
            case 4:
                base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
                altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
                resultadop=rectangulop(altura,base);
                resultadoa=rectanguloa(altura,base);
                JOptionPane.showMessageDialog(null,"El area es: "+resultadoa+"\nEl perimetro es: "+resultadop);
            break;
            default:
                break;
        }
    }
    //metodos que retornan operaciones
    public double cuadradop(double lado1){
       pr=lado1*4;
        return pr;
    }
    public double cuadradoa(double lado1){
         ar=lado1*lado1;
        return ar;
    }
    public double circulop(double base){
        pr=(3.1416*2)*base;
         return pr;
     }
     public double circuloa(double base){
          ar=3.1416*base*base;
         return ar;
     }
    public double triangulop(double lado1,double base,double lado2){
        pr=lado1+base+lado2;
        return pr;
    }
    public double trianguloa(double altura,double base){
         ar=(base*altura)/2;
        return ar;
    }
    public double rectangulop(double base,double altura){
        pr=(base*2)+(altura*2);
        return pr;
    }
    public double rectanguloa(double altura,double base){
         ar=base*altura;
        return ar;
    }
}