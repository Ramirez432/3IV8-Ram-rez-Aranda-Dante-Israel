import javax.swing.JOptionPane;
public class Metodos{
    public  void Menu(){
        char a;
        String dec;
        do{
            JOptionPane.showMessageDialog(null,"Ramirez Aranda Dante Israel.3IV8");
            int op=Integer.parseInt(JOptionPane.showInputDialog("1.Calcular Edad\n2.Figuras\n3.Llamadas"));
            switch (op) {
                case 1:
                    //manda llamar al metodo de ese clase
                    CalcularEdad obj=new CalcularEdad();
                    obj.PedirD();
                    break;
                case 2:
                    //manda llamar al metodo de ese clase
                    Figuras dante=new Figuras();
                    dante.F();
                    break;
                case 3:
                    //manda llamar al metodo de ese clase
                    Llamada e=new Llamada();
                    e.Celular();
                    break;                    
                default:
                    break;
            } 
             dec=JOptionPane.showInputDialog(null,"¿Deseas repetir el programa?, si lo desea escriba s");
             a=dec.charAt(0);//Convierte de tipo String a char para poder repetir
        }while(a=='s');
    }
}