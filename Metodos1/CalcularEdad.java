import javax.swing.JOptionPane;
public class CalcularEdad{
    //variables privadas y universales
    private int edad,dia,mes,anio,dactual,mactual,anioactual,resultado,anior;
    //metodo pedir datos
    public void PedirD(){
        int dia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia de tu nacimiento"));
        if(dia>30){
            //comprueba que no se metan numeros mayores
            //a la cantidad de dias en un mes
            JOptionPane.showMessageDialog(null,"Ingresa un dia menor");
            dia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia de tu nacimiento"));
        }
        if(dia<0){
            JOptionPane.showMessageDialog(null,"Ingresa un numero mayor");
            dia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia de tu nacimiento"));
        }

        int mes=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de tu nacimiento"));
        if(mes>12){
            //comprueba que no se metan numeros mayores
            //a la cantidad de  meses en un año
            JOptionPane.showMessageDialog(null,"Ingresa un mes menor");
            mes=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de tu nacimiento"));
        }
        if(mes<0){
            JOptionPane.showMessageDialog(null,"Ingresa un mes mayor");
            mes=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de tu nacimiento"));
        }

        int anio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de tu nacimiento"));
        if(anio>2020){
            JOptionPane.showMessageDialog(null,"¿Vienes del futuro? Ingresa un año menor :)");
            anio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de tu nacimiento"));
        }
        if(anio<1907){
            //la persona mas longeva viva actualmente nacio en 1907
            JOptionPane.showMessageDialog(null,"¿Eres la persona mas longeva del mundo?Ingresa un año mayor");
            anio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de tu nacimiento"));
        }

        int dactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia actual"));
        if(dactual>30){
            JOptionPane.showMessageDialog(null,"Ingresa un dia menor");
            dactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia actual"));
        }
        if(dactual<0){
            JOptionPane.showMessageDialog(null,"Ingresa un numero mayor");
            dactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia actual"));
        }
        int mactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes actual"));
        if(mes>12){
            JOptionPane.showMessageDialog(null,"Ingresa un mes menor");
            mactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes actual"));
        }
        if(mactual<0){
            JOptionPane.showMessageDialog(null,"Ingresa un mes mayor");
            mactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de tu nacimiento"));
        }
        int anioactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año año"));
        if(anioactual>2020 || anioactual>2020){
            JOptionPane.showMessageDialog(null,"¿Por desgracia estamos en el 2020 no en el año: "+anioactual);
            anioactual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año actual"));
        }
        resultado=Calcular(mes,dia,anio,mactual,dactual,anioactual);
        JOptionPane.showMessageDialog(null,"Tu edad es: "+resultado);
    }
    //metodo para calcular la edad
    public int Calcular(int mes, int dia,int anio,int mactual, int dactual,int anioactual){
        anior=anioactual-anio;
        if(mes>mactual){
            edad=anior-1;
        }
        if(mes<mactual){
            edad=anior;
        }
        if(mes==mactual && dia<dactual ){
            edad=anior;
        }
        if(mes==mactual && dia>dactual){
            edad=anior-1;
        }
        if(mes==mactual && dia==dactual){
            edad=anior;
        }
        return edad;
    }
}