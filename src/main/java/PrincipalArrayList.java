//Crear un programa que use ArrayList de números reales. 
//El programa debe tener un menú de opciones, 
//donde se pueda agregar un número, buscar un número determinado,
//poder modificar un número, eliminar un número e insertar un número en una posición dada.
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class PrincipalArrayList {
    public static void main(String[] args) {
        ListaNumero lista=new ListaNumero();
        lista.ListaNumero= new ArrayList();
     
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Ingresar elemento\n"
                    + "2. Buscar elemento\n"
                    + "3. Insertar elemento\n"
                    + "4. Modificar elemento\n"
                    + "5. Mostrar elemento\n"
                    + "6. Eliminar elemento\n"
                    + "7. Salir\n"
                    + "--------------------------------------------------------\n"
                    + "Ingrese la opción [1 - 7]", "Menu ArrayList", JOptionPane.QUESTION_MESSAGE));

            switch (op) {
                case 1:
                    lista.ingresar();
                    break;
                case 2:
                    lista.buscar();
                    break;
                case 3:
                    lista.insertar();
                    break;
                case 4:
                    lista.modificar();
                    break;
                case 5:
                    lista.mostrar();
                    break;
                case 6:
                    lista.eliminar();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresa una opción valida \n", "Error", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true);
    }
}
    
