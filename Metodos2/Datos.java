import javax.swing.JOptionPane;
public class Datos extends Trabajador{
    public Datos(){

    }
    public Datos(String nombre,int id,String puesto,int sueldo){
        super(nombre,id,puesto,sueldo);
    }
    public void MostrarD(){
        JOptionPane.showMessageDialog(null,"El nombre del empleado es:"+getNombre()
                                            +"\nSu id es: "+getId()
                                            +"\nSu puesto es:"+getPuesto()
                                            +"\nSu sueldo es: "+getSueldo());
    }
}