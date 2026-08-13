/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 3)
 * Reto 10: Números del 1 al 30 con salto de línea cada 7
 */

import javax.swing.*;
import java.awt.FlowLayout;


public class SaltoDeLineaVisual extends JFrame {
    JButton btnGenerar;
    JTextArea areaResultados;

    public SaltoDeLineaVisual() {
        setTitle("Serie con Saltos");
        setSize(250, 250);
        setLayout(new FlowLayout());
        
        btnGenerar = new JButton("Generar Serie");
        areaResultados = new JTextArea(8, 15);
        areaResultados.setEditable(false);
        
        btnGenerar.addActionListener(e -> {
            areaResultados.setText("");
            
            for (int i = 1; i <= 30; i++) {
    areaResultados.append(i + " ");
    if (i % 7 == 0) {
        areaResultados.append("\n");
    }
}
        });
        
        add(btnGenerar); add(new JScrollPane(areaResultados));
    }

    public static void main(String[] args) {
        new SaltoDeLineaVisual().setVisible(true);
    }
}