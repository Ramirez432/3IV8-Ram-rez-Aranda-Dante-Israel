import javax.swing.JOptionPane;
//la clase hija que llama los atributos de la clase padre
public class Jugador extends Persona{
        public Jugador(){
        }
    public Jugador(String nombre,int edad){
        //ocupamos super para acceder a los datos de la clase padre
        super(nombre,edad);
    }
    //muestra los datos del primer jugador
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null,"El nombre del Jugador 1  es: " + getNombre()
                            + "\nsu edad es de: " + getEdad());
    }
    //muestra los datos del segundo jugador
    public void MostrarDatos2(){
        JOptionPane.showMessageDialog(null,"El nombre del Jugador 2 es: " + getNombre()
                            + "\nsu edad es de: " + getEdad());
    }

}