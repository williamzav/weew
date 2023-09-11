import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Test2 {
    static ArrayList <String> fu = new ArrayList <String>();
    static int num, pe=0;
    
    public static void agregar (){
        fu.add(JOptionPane.showInputDialog("Escribe la cancion deseada"));
    }
    public static void actualizar () {
        Collections.sort(fu);
        num=Integer.parseInt(JOptionPane.showInputDialog(fu + " \n elige que cancion quieres actualizar con numeros "));
        fu.set(num-1, JOptionPane.showInputDialog("agreg una cancion"));
    }
    public static void elim_una (){
        Collections.sort(fu);
        num = Integer.parseInt(JOptionPane.showInputDialog(fu + "\n elige cual de estas deceas eliminar con numeros"));
        fu.remove(num-1);
    }
    public static void leer(){
        if(fu.size()>0){
        Collections.sort(fu);
        JOptionPane.showMessageDialog( null,fu);
        }else{
            JOptionPane.showMessageDialog(null,"No tienes ninguna cancion en tu playlist");
        }
    }
    public static void elim_to(){
        fu.clear();
    }
    public static void pro (){
        
        do{
            try{
            pe = Integer.parseInt(JOptionPane.showInputDialog("Escribe que deceas hacer \n 1.-leer \n 2.-agregar \n 3.-eliminar una cancion \n 4.-actualizar \n 5.-eliminar todo"));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
                pro();
            }
            switch (pe) {
                case 1:
                    leer();
                    break;
                case 2:
                    agregar();
                    break;
                case 3:
                    elim_una();
                    break;
                case 4:
                    actualizar();
                    break;
                case 5:
                    elim_to();
                    break;
                default :
                    pro();
                    break;
            }

        }while(JOptionPane.showConfirmDialog(null, "Quieres regresar al menu  principal", null, 0,JOptionPane.YES_NO_OPTION)==0); 
         
    }
    public static void main(String[] args) {
        do{
        JOptionPane.showMessageDialog(null,"BIENVENIDO A TU PLAYLIST");
        pro();
        }while(JOptionPane.showConfirmDialog(null, "Quieres repetir el programa", null, 0,JOptionPane.YES_NO_OPTION)==0);
    }

    
}
