
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaNumero {

    ArrayList<Double> ListaNumero;

    public void ingresar() {
        double valor = 0;
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un valor", "Ingresar elemento", JOptionPane.QUESTION_MESSAGE));
        ListaNumero.add(valor);
    }

    public void buscar() {
        double valor = 0;
        int indice = 0;
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Buscar valor", "Buscar elemento", JOptionPane.QUESTION_MESSAGE));
        indice = ListaNumero.indexOf(valor);
        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "El dato se encuentra en la posición " + indice);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        }
    }

    public void modificar() {
        double valor, nuevoValor;
        int indice;
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Modificar valor", "Modificar elemento", JOptionPane.QUESTION_MESSAGE));
        indice = ListaNumero.indexOf(valor);
        if (indice != -1) {

            nuevoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Nuevo valor", "Nuevo elemento", JOptionPane.QUESTION_MESSAGE));
            ListaNumero.set(indice, nuevoValor);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        }
    }

    public void eliminar() {
        double valor;
        int indice;
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Eliminar valor", "Eliminar elemento", JOptionPane.QUESTION_MESSAGE));
        indice = ListaNumero.indexOf(valor);
        if (indice != -1) {
            ListaNumero.remove(indice);
            JOptionPane.showMessageDialog(null, "El dato se elimino");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        }
    }

    public void insertar() {
        double valor;
        int indice;
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insertar un valor", "Insertar elemento", JOptionPane.QUESTION_MESSAGE));
        indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Posición en donde desea insertar", "Posición elemento", JOptionPane.QUESTION_MESSAGE));
        ListaNumero.add(indice, valor);
    }

    public void mostrar() {
        if (ListaNumero.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El ArrayList está vacío\n No hay datos que mostrar", "Mostrar datos", JOptionPane.WARNING_MESSAGE);
        } else {
            String ver = "";
            for (int i =0 + 1; i <ListaNumero.size(); i++) {
                ver = ver+ListaNumero.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, "Los datos del ArrayList son : \n" + ver, "Mostrar datos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
