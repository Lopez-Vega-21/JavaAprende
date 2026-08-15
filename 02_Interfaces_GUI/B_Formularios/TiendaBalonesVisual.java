import javax.swing.*;
import java.awt.FlowLayout;

public class TiendaBalonesVisual extends JFrame {
    JTextField cajaCantidad;
    JButton btnCotizar;
    JLabel etiquetaTotal;

    public TiendaBalonesVisual() {
        setTitle("Cotizador de Balones");
        setSize(300, 150);
        setLayout(new FlowLayout());

        cajaCantidad = new JTextField(10);
        btnCotizar = new JButton("Calcular Total");
        etiquetaTotal = new JLabel("Total a pagar: $0");

        btnCotizar.addActionListener(e -> {
            int cantidad = Integer.parseInt(cajaCantidad.getText());
            int precioUnitario;
            
            if (cantidad > 15) {
                precioUnitario = 85;
            } else if (cantidad >= 11) {
                precioUnitario = 92;
            } else {
                precioUnitario = 99;
            }
            
            int total = cantidad * precioUnitario;
            etiquetaTotal.setText("Total a pagar: $" + total);
        });

        add(new JLabel("¿Cuántos balones llevas?"));
        add(cajaCantidad); add(btnCotizar); add(etiquetaTotal);
    }

    public static void main(String[] args) {
        new TiendaBalonesVisual().setVisible(true);
    }
}
