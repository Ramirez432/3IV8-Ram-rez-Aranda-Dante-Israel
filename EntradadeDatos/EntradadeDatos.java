//obtener un texto como entrada de datos

class EntradadeDatos{

    public static void main(String[]args) {
        String nombre;
        System.out.println("Por favor, dime tu nombre");

        //primer forma para texto 
        nombre= System.console().readLine();

        System.out.println("Hola " +nombre+" bienvenido a tu segundo programa");

    }
}