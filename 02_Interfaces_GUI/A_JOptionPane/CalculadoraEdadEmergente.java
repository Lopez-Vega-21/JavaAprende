import javax.swing.JOptionPane;

public class CalculadoraEdadEmergente {
    public static void main(String[] args) {
        String inputEdad = JOptionPane.showInputDialog("¿Cuántos años tienes?");
        
        int edad = Integer.parseInt(inputEdad);
        int meses = edad * 12;
        int dias = edad * 365;
        
        JOptionPane.showMessageDialog(null, "Tienes " + meses + " meses y " + dias + " días vividos.");
    }
}
