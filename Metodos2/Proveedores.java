import javax.swing.JOptionPane;

public class Proveedores{
    String nombre_cliente;
    int[] costo=new int[10];
    int[] cantidad=new int[10];
    String[] producto=new String[10];
    float suma,m,mi,p;
    public void DatosP(){
        nombre_cliente=JOptionPane.showInputDialog("Ingrese el nombre de su cliente:");
        JOptionPane.showMessageDialog(null,"Ingrese el costo y el nombre de sus productos a continuacion");
        for(int i=0;i<10;i++){
            costo[i]=Integer.parseInt(JOptionPane.showInputDialog("Costo:"));
            suma+=costo[i];
            producto[i]=JOptionPane.showInputDialog("Producto:");
        }
        mi=m=costo[0];
        for(int i=0;i<costo.length;i++){
            if(costo[i]>m){
                m=costo[i];
            }
            else if(costo[i]<mi){
                mi=costo[i];
            }
        }
        for(int j=0;j<cantidad.length;j++){
            cantidad[j]=Integer.parseInt(JOptionPane.showInputDialog((j+1)+"Ingrese la cantidad existente:"));
        }
        Datos();
    }
    public void Datos(){
        JOptionPane.showMessageDialog(null,"El total de costos es de:$"+suma
                                            +"\nCosto mayor:$"+m
                                            +"\nCosto menor:$"+mi);
        p=suma/costo.length;
        JOptionPane.showMessageDialog(null, "El promedio de los costos es de:$"+p);
        JOptionPane.showMessageDialog(null,"Su cliente es: "+nombre_cliente);
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[0]+"\nProducto: "+producto[0]+"\ncosto"+costo[0]); 
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[1]+"\nProducto: "+producto[1]+"\ncosto"+costo[1]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[2]+"\nProducto: "+producto[2]+"\ncosto"+costo[2]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[3]+"\nProducto: "+producto[3]+"\ncosto"+costo[3]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[4]+"\nProducto: "+producto[4]+"\ncosto"+costo[4]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[5]+"\nProducto: "+producto[5]+"\ncosto"+costo[5]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[6]+"\nProducto: "+producto[6]+"\ncosto"+costo[6]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[7]+"\nProducto: "+producto[7]+"\ncosto"+costo[7]);  
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[8]+"\nProducto: "+producto[8]+"\ncosto"+costo[8]); 
        JOptionPane.showMessageDialog(null,"Cantidad: "+cantidad[9]+"\nProducto: "+producto[9]+"\ncosto"+costo[9]); 
    }
}