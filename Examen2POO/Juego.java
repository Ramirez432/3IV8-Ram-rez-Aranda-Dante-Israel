import javax.swing.JOptionPane;
public class Juego{
    int intentos,intentos2;
    int score1,score,edad;
    String nombre;
    public void Ahorcado(){

    }
    //en el modo facil solo se cuento con un intento
    public void Facil(){
        //palabras para cada jugador
        String cadena="Perros";
        String cadena1="Carros";
        //tranforma en char las palabras
        for (int i=0;i<cadena.length();i++){
            char letra = cadena.charAt(i);
        }
        for (int i=0;i<cadena1.length();i++){
            char letra=cadena1.charAt(i);
        }
        //pide datos del jugador 1
        nombre=JOptionPane.showInputDialog("Turno del jugador 1\nIngrese su nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        //guarda datos del jugador 1
        Jugador mostrar=new Jugador(nombre,edad);
        //pide la palabra a adivinar, incluyendo pistas
        String l=JOptionPane.showInputDialog("Ingresa la palabra"
                                                +"\nLa pista: P_ _ _ o s");
        //si la palabra ingresada es equivalente o igual a la palabra a adivinar 
        //la score es de 1000, si no es de 0
            if(l.equals(cadena)){
                JOptionPane.showMessageDialog(null,"Felidades, lo haz logrado\nLa palabra es: "+cadena);
                score=1000;
            }else{
                score=0;
                JOptionPane.showMessageDialog(null,"La palabra era: "+cadena);
                //imprime el dibijo del ahorcado
                Juego d1=new Juego();
                d1.ahorcado3();
            }
            nombre=JOptionPane.showInputDialog("Turno del jugador2 \nIngrese su nombre");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
            Jugador mostrar2=new Jugador(nombre,edad);
            String l2=JOptionPane.showInputDialog("Ingresa la letra\nLa pista: C_ _ r _ s ");
            if(l2.equals(cadena1)){
                JOptionPane.showMessageDialog(null,"Felidades, lo haz logrado\nLa palabra es: "+cadena1);
                score1=1000;
            }else{
                score1=0;
                JOptionPane.showMessageDialog(null,"La palabra era: "+cadena1);
                Juego d1=new Juego();
                d1.ahorcado3();
            }
            //muestra los datos del jugador 1 y su score
                mostrar.MostrarDatos();
                JOptionPane.showMessageDialog(null,"Tu score es de: "+score);
                mostrar2.MostrarDatos2();
                JOptionPane.showMessageDialog(null,"Tu score es de: "+score1);
            //compara las score para determinar un ganador o declarar un empate
                if(score>score1){
                    JOptionPane.showMessageDialog(null,"El ganador es el jugador 1");
                }
                if(score1>score){
                    JOptionPane.showMessageDialog(null,"El ganador es el jugador 2");
                }
                if(score1==score){
                    JOptionPane.showMessageDialog(null,"Empate");
                }
    }
    //por la dificultad se cuenta con 3 intentos
    public void Dificil(){
        intentos2=3;
        intentos=3;
        String cadena="Carroceria";
        String cadena1="Artificial";
        for (int i=0;i<cadena.length();i++){
            char letra = cadena.charAt(i);
        }
        for (int i=0;i<cadena1.length();i++){
            char letra=cadena1.charAt(i);
        }
        nombre=JOptionPane.showInputDialog("Turno del jugador 1\nIngrese su nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        Jugador mostrar=new Jugador(nombre,edad);
        //el juego se repetira hasta que el numero de intentos sea 0
        //si el jugador acierta el numero de intentos sera de 0, se dara por terminado su turno 
        //y su score sera de 10000
        do{
            String l=JOptionPane.showInputDialog("Ingresa la palabra"
                                                +"\nLa pista: C_ rr_ c _ _ ia");  
            if(l.equals(cadena)){
                JOptionPane.showMessageDialog(null,"Felidades, lo haz logrado\nLa palabra es: "+cadena);
                score=10000;
                intentos=0;
                //cada que el usuario no acierte el numero de oportunidades disminuira 1
                // y en cada caso se imprimira una parte del ahorcado
            }else{
                intentos--;
                if(intentos==2){
                    Juego d1=new Juego();
                    d1.ahorcado1();
                    JOptionPane.showMessageDialog(null,"Te quedan "+intentos+" intentos");
                }
                if(intentos==1){
                    Juego d2=new Juego();
                    d2.ahorcado2();
                    JOptionPane.showMessageDialog(null,"Te quedan "+intentos+" intentos");
                }
                if(intentos==0){
                    score=0;
                    JOptionPane.showMessageDialog(null,"La palabra era: "+cadena);
                    Juego d3=new Juego();
                    d3.ahorcado3();
                }
                
            }
        }while(intentos>0);
        nombre=JOptionPane.showInputDialog("Turno del jugador 2\nIngrese su nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        Jugador mostrar2=new Jugador(nombre,edad);
        do{
            String l=JOptionPane.showInputDialog("Ingresa la palabra"
                                                +"\nLa pista: A _ _ if _ ci _ l");  
            if(l.equals(cadena1)){
                JOptionPane.showMessageDialog(null,"Felidades, lo haz logrado\nLa palabra es: "+cadena1);
                score1=10000;
                intentos2=0;
            }else{
                intentos2--;
                if(intentos2==2){
                    Juego d1=new Juego();
                    d1.ahorcado1();
                    JOptionPane.showMessageDialog(null,"Te quedan "+intentos2+" intentos");
                }
                if(intentos2==1){
                    Juego d2=new Juego();
                    d2.ahorcado2();
                    JOptionPane.showMessageDialog(null,"Te quedan "+intentos2+" intentos");
                }
                if(intentos2==0){
                    score1=0;
                    JOptionPane.showMessageDialog(null,"La palabra era: "+cadena1);
                    Juego d3=new Juego();
                    d3.ahorcado3();
                }
                
            }
        }while(intentos2>0);
        mostrar.MostrarDatos();
        JOptionPane.showMessageDialog(null,"Tu score es de: "+score);
        mostrar2.MostrarDatos2();
        JOptionPane.showMessageDialog(null,"Tu score es de: "+score1);
        if(score>score1){
            JOptionPane.showMessageDialog(null,"El ganador es el jugador 1");
        }
        if(score1>score){
            JOptionPane.showMessageDialog(null,"El ganador es el jugador 2");
        }
        if(score1==score){
            JOptionPane.showMessageDialog(null,"Empate");
        }
    } 
    //metodos para imprimir partes del ahorcado segun su numero de intetos fallidos

    public void ahorcado1(){
        JOptionPane.showMessageDialog(null," ---------------------"
                    +"\n|                     |"
                    +"\n|                     |");
    }
    
    public void ahorcado2(){
        JOptionPane.showMessageDialog(null," ---------------------"
                    +"\n|                     |"
                    +"\n|                     |"
                    +"\n|                  -------"
                    +"\n|                 | X  X  |"
                    +"\n|                 |   o   |"
                    +"\n|                  -------"
                    +"\n|                     |   "
                    +"\n|                   / | \\ ");  
    }

    public void ahorcado3(){
        JOptionPane.showMessageDialog(null," ---------------------"
                    +"\n|                     |"
                    +"\n|                     |"
                    +"\n|                  -------"
                    +"\n|                 | X  X  |"
                    +"\n|                 |   o   |"
                    +"\n|                  -------"
                    +"\n|                     |   "
                    +"\n|                   / | \\ "
                    +"\n|                  /  |   \\ "
                    +"\n|                 /   |     \\ "
                    +"\n|                     |   "
                    +"\n|                    / \\"
                    +"\n|                   /   \\  "
                    +"\n|                  /     \\ ");   
    }
}