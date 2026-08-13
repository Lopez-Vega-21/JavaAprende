import javax.swing.*;
import java.awt.FlowLayout;

public class SumaCuadradosVisual extends JFrame {
    JButton btnCalcalcular;
    JLabel etiquetaResultado;

    public SumaCuadradosVisual() {
        setTitle("Suma de Cuadrados");
        setSize(280, 150);
        setLayout(new FlowLayout());

        btnCalcalcular = new JButton("Calcular Suma (1 al 100)");
        etiquetaResultado = new JLabel("Resultado: ---");

        btnCalcalcular.addActionListener(e -> {
            int sumador = 0;
            for (int i = 1; i <= 100; i++) {
                sumador += (i * i);
            }
            etiquetaResultado.setText("Resultado: " + sumador);
        });

        add(btnCalcalcular); 
        add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new SumaCuadradosVisual().setVisible(true);
    }
}


