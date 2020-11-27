import javax.swing.JOptionPane;
public class Menu{
    int op;
    char a;
    String dec;
    public void MenuF(){
        
    /*Menu del juego para elegir la dificultad
    y ocupe el do while para que se repita si el usuario 
    pone la s
    */
        do{
            JOptionPane.showMessageDialog(null,"Bienvenido a el menu del juego ahorcado"
                                            +"\nRealizado por:Ramirez Aranda Dante Israel-3IV8");
            op=Integer.parseInt(JOptionPane.showInputDialog("\nEliga la dificultad"
                                                                    +"\n1.Facil"
                                                                    +"\n2.Dificil"));
            switch (op){
                case 1:
                    Juego f=new Juego();
                    f.Facil();
                    break;
                case 2:
                    Juego d=new Juego();
                    d.Dificil();
                    break;
                default:
                    break;
            }
            try{

                dec=JOptionPane.showInputDialog(null,"¿Deseas repetir el programa?, si lo desea escriba s");
                a=dec.charAt(0); //Convierte de tipo String a char para poder repetir
                //cacha el error mediante el objeto e
            }catch(Exception e){
                //mensaje de error
                System.out.println("Ingresa solo letras");
                //saber el tipo de error
                System.out.println("Error: "+ e.getMessage());
            }
        }while(a=='s');
        
    }
}