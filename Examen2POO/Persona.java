/*
herencia para los datos de los jugadores, ya que 
comparten las caracteristicas nombre y edad
*/
public class Persona{
    //se ocupa el encapsulamiento
    //para poder proteger el acceso a las variables de la clase
    private String nombre;
    private int edad;
    //constructor
    public Persona(){

    }
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //para poder enviar y obtener las variables ocupamos los metodos get y set    
    //recibe obtiene
    public String getNombre(){
        return nombre;
    }
    //envia u establecer
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}