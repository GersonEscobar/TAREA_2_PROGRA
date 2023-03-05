
package listas;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson
 */
public class Principal {
    public static void main(String[] args) {
        int opcion= 0, el;
        Listas mensajero = new Listas();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Agregar un elemento\n"
                                + "2. Mostrar los datos de la lista\n"
                                + "3. Salir","Menu de Opciones",3));
                switch(opcion){
                    case 1:
                        try{
                            el=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento","Insertando al inicio",3)); 
                            //Agrega el Nodo
                            mensajero.Agregar(el);
                            
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
                        }
                        break;
                    case 2:
                        mensajero.Mostrar();
                        break;
                    case 3:
                        break;
                      
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
            
        }while(opcion!=3);
        
    }
}
