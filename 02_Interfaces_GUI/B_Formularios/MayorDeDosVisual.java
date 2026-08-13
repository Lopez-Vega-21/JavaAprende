import javax.swing.*;
import java.awt.FlowLayout;

public class MayorDeDosVisual extends JFrame {
    JTextField cajaNum1, cajaNum2;
    JButton btnEvaluar;
    JLabel etiquetaResultado;

    public MayorDeDosVisual() {
        setTitle("El Mayor de Dos");
        setSize(250, 200);
        setLayout(new FlowLayout());

        cajaNum1 = new JTextField(5);
        cajaNum2 = new JTextField(5);
        btnEvaluar = new JButton("¿Cuál es mayor?");
        etiquetaResultado = new JLabel("Esperando números...");

        btnEvaluar.addActionListener(e -> {
            int num1 = Integer.parseInt(cajaNum1.getText());
            int num2 = Integer.parseInt(cajaNum2.getText());
            
            if (num1 > num2) {
                etiquetaResultado.setText("El mayor es: " + num1);
            } else if (num2 > num1) {
                etiquetaResultado.setText("El mayor es: " + num2);
            } else {
                etiquetaResultado.setText("Son iguales");
            }
        });

        add(new JLabel("Número 1:")); add(cajaNum1);
        add(new JLabel("Número 2:")); add(cajaNum2);
        add(btnEvaluar); add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new MayorDeDosVisual().setVisible(true);
    }
}
