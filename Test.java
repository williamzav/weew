import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayList <String> canciones = new ArrayList <String> ();
        //agregar 
        canciones.add("no se");
        System.out.println(canciones);
        canciones.add("una pieza que no se baila");
        System.out.println(canciones);
        //devolver un valor dentro de un  array o elegir un valor 
        System.out.println(canciones.get(1));
        //tener la longitud del Array
        System.out.println(canciones.size());
        //eliminar lo que esta en la pocicion 
        canciones.remove(0);
        canciones.add("el queria una cancion ");
        canciones.add("el queria una cancion");
        canciones.add("Se fue la luz");
        //sirve para actualizar los valores del array
        canciones.set(2, "alma enamorada"); 
        System.out.println(canciones);
        //todo se va  eliminar
        canciones.clear();       

    }
}