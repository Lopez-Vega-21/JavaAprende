import javax.swing.*;
import java.awt.FlowLayout;


public class TablaMultiplicarVisual extends JFrame {
    JTextField cajaNumero;
    JButton btnGenerar;
    JTextArea areaResultados;

    public TablaMultiplicarVisual() {
        setTitle("Tablas Mágicas");
        setSize(250, 350);
        setLayout(new FlowLayout());
        
        cajaNumero = new JTextField(5);
        btnGenerar = new JButton("Generar");
        areaResultados = new JTextArea(10, 15); 
        areaResultados.setEditable(false);
        
        btnGenerar.addActionListener(e -> {
            areaResultados.setText(""); 
            
            int numero = Integer.parseInt(cajaNumero.getText());
for (int i = 1; i <= 10; i++) {
    areaResultados.append(numero + " x " + i + " = " + (numero * i) + "\n");
}
        });
        
        add(new JLabel("Tabla del:")); add(cajaNumero);
        add(btnGenerar); add(new JScrollPane(areaResultados));
    }

    public static void main(String[] args) {
        new TablaMultiplicarVisual().setVisible(true);
    }
}