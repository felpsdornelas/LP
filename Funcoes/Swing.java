import javax.swing.*;

import java.awt.FlowLayout;

public class Swing {

public static void main(String[] args) {

SwingUtilities.invokeLater(() -> {

JFrame frame = new JFrame("Aplicação GUI");

frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

frame.setLayout(new FlowLayout());

JLabel label = new JLabel("Digite um nome");

JTextField txt = new JTextField(15);

frame.getContentPane().add(label);

frame.getContentPane().add(txt);

frame.setSize(300, 200);

frame.setLocationRelativeTo(null);

frame.setVisible(true);

});

}

}