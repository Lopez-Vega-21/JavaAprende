import javax.swing.*;
import java.awt.FlowLayout;

public class ParImparVisual extends JFrame {
    JTextField cajaNumero;
    JButton btnValidar;
    JLabel etiquetaResultado;

    public ParImparVisual() {
        setTitle("Validador Numérico");
        setSize(250, 150);
        setLayout(new FlowLayout());

        cajaNumero = new JTextField(10);
        btnValidar = new JButton("Comprobar");
        etiquetaResultado = new JLabel("Esperando número...");

        btnValidar.addActionListener(e -> {
            int numero = Integer.parseInt(cajaNumero.getText());
            
            if (numero % 2 == 0) {
                etiquetaResultado.setText("El número es par");
            } else {
                etiquetaResultado.setText("El número es impar");
            }
        });

        add(new JLabel("Ingresa un número:"));
        add(cajaNumero); add(btnValidar); add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new ParImparVisual().setVisible(true);
    }
}
