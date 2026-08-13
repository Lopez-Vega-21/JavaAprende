import javax.swing.JOptionPane;

public class PromedioVisual {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingresa la primera calificación:");
        String input2 = JOptionPane.showInputDialog("Ingresa la segunda calificación:");
        String input3 = JOptionPane.showInputDialog("Ingresa la tercera calificación:");
        String input4 = JOptionPane.showInputDialog("Ingresa la cuarta calificación:");
        
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double num3 = Double.parseDouble(input3);
        double num4 = Double.parseDouble(input4);
        
        double promedio = (num1 + num2 + num3 + num4) / 4.0;
        
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
}
