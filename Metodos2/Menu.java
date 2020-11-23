import javax.swing.JOptionPane;
public class Menu{
    public  void Unico(){
        char a;
       int sueldo,base=5000,hd,hn,id;
        String dec,puesto,nom;
        do{
            JOptionPane.showMessageDialog(null,"Ramirez Aranda Dante Israel.3IV8");
            int op=Integer.parseInt(JOptionPane.showInputDialog("1.Sueldo"
                                                                +"\n2.Proveedores"
                                                                +"\n3.Libreria"));
            switch (op) {
                case 1:
                nom=JOptionPane.showInputDialog("Ingresa el nombre del empleado");
                id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del trabajador"));
                puesto=JOptionPane.showInputDialog("Ingresa el puesto del empleado"
                                                    +"\n1.Empleado"
                                                    +"\n2.Supervisor");
                if(puesto.equals("Supervisor")){
                    sueldo=7463;
                    Datos t1=new Datos(nom,id,puesto,sueldo);
                    t1.MostrarD();
                }
                if(puesto.equals("Empleado")){
                    hd=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras diurnas trabajadas"));
                    hn=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras nocturnas trabajadas"));
                    sueldo=base+(hd*50)+(hn*60);
                    Datos t1=new Datos(nom,id,puesto,sueldo);
                    t1.MostrarD();
                }
                    break;
                case 2:
                Proveedores provee=new Proveedores();
                provee.DatosP();                                   
                    break;
                case 3:
                    DatosL l1=new DatosL();
                    String Titulo=JOptionPane.showInputDialog("Ingrese el titulo");
                    String Autor=JOptionPane.showInputDialog("Ingrese el autor"); 
                    int ejemplares=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de libros existentes"));
                    int prestado=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de libros prestados"));
                    l1.setTitulo(Titulo);
                    l1.setAutor(Autor);
                    l1.setEjemplares(ejemplares);
                    l1.setPrestados(prestado);
                    if(l1.prestamo()){
                      JOptionPane.showMessageDialog(null,"se presto\n"+l1.getTitulo());

                    }else{
                        JOptionPane.showMessageDialog(null,"No hay ejemplares de \n"+l1.getTitulo());
                    }
                    JOptionPane.showMessageDialog(null,"Se han prestado"+l1.getPrestados());
                    if(l1.devolucion()){
                        JOptionPane.showMessageDialog(null,"se devolvio\n"+l1.getTitulo());
                    }else{
                        JOptionPane.showMessageDialog(null,"No hay ejemplares de \n"+l1.getTitulo());
                    }
                    JOptionPane.showMessageDialog(null,"Se han prestado "+l1.getPrestados());
                    break;                    
                default:
                    break;
            } 
             dec=JOptionPane.showInputDialog(null,"¿Deseas repetir el programa?, si lo desea escriba s");
             a=dec.charAt(0);//Convierte de tipo String a char para poder repetir
        }while(a=='s');
    }
}