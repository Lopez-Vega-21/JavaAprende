import javax.swing.*;
import java.awt.FlowLayout;


public class ClasificadorPrimosVisual extends JFrame {
    JButton btnBuscar;
    JTextArea areaResultados;

    public ClasificadorPrimosVisual() {
        setTitle("Buscador de Primos");
        setSize(300, 300);
        setLayout(new FlowLayout());
        
        btnBuscar = new JButton("Encontrar Primos (1-100)");
        areaResultados = new JTextArea(10, 20);
        areaResultados.setEditable(false);
        
        btnBuscar.addActionListener(e -> {
            areaResultados.setText("Primos encontrados:\n");
            
            for (int i = 2; i <= 100; i++) {
    boolean esPrimo = true;
    for (int j = 2; j <= i - 1; j++) {
        if (i % j == 0) {
            esPrimo = false;
            break;
        }
    }
    if (esPrimo) {
        areaResultados.append(i + ", ");
    }
}
        });
        
        add(btnBuscar); add(new JScrollPane(areaResultados));
    }

    public static void main(String[] args) {
        new ClasificadorPrimosVisual().setVisible(true);
    }
}