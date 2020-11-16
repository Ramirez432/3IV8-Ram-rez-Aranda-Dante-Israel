import javax.swing.JOptionPane;
public class Llamada{
    //Variables universales.
    private int credito=50,cantidad,nacional=0,inter=0,celular=0;
    private double resta=0,rn=0,ri=0,rc=0;
    public void Celular(){
        //se pide la cantidad de llamadas para el arreglo
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantas llamadas realizo en total"));
        int[] arreglo=new int[cantidad];

        JOptionPane.showMessageDialog(null,"¿Que llamada realizaste?\n1. Nacional\n2.Internacional\n3.Celular");    
        for (int i =0;i<arreglo.length;i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Tipo de llamada"));    
        }
        for (int i =0;i<arreglo.length;i++){
            if(arreglo[i]==1){
                nacional++;
                rn=nacional*0.5;
            }
            if(arreglo[i]==2){
                inter++;
                ri=inter*0.6;
            }
            if (arreglo[i]==3){
                celular++;
                rc=celular*0.2;
            }
        }
        resta=rc+rn+ri;
        Saldo();
    }
    //Consulta de saldo final:)
    public void Saldo(){
        int saldo=Integer.parseInt(JOptionPane.showInputDialog("Si quiere conocer su saldo actual, presiona 0"));
        if(saldo==0){
            resta=credito-resta;
            JOptionPane.showMessageDialog(null,"Su saldo es de $"+resta);
        }
    }
}