import javax.swing.JOptionPane;

public class CalculadoraCirculoEmergente {
    public static void main(String[] args) {
        String inputRadio = JOptionPane.showInputDialog("Ingresa el radio del círculo:");
        
        double radio = Double.parseDouble(inputRadio);
        double area = Math.PI * radio * radio;
        
        JOptionPane.showMessageDialog(null, "El área es: " + area);
    }
}
