//clase principal para datos
public class Trabajador{
    //encapsulamiento
    private String nombre,puesto;
    private int sueldo,id;
    public Trabajador(){
      nombre="";
      puesto="";   
    }
    public Trabajador(String nombre,int id,String puesto,int sueldo){
        this.nombre=nombre;
        this.puesto=puesto;
        this.sueldo=sueldo;
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto=puesto;
    }
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

}