import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoveSwing {
    private JFrame frame;
    private JLabel label;
    private JButton botao;

    public LoveSwing() {
        // Cria o quadro
        frame = new JFrame("Exemplo de Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Cria a etiqueta com a palavra fofa
        label = new JLabel("Oioi gatinha");
        frame.add(label);

        // Cria o botão
        botao = new JButton("Aperta aq pô");
        frame.add(botao);

        // Define o ActionListener para o botão
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cria uma nova mensagem de diálogo com a mensagem "Eu te amo"
                JOptionPane.showMessageDialog(frame, "Aperta assim n q eu fico apaixonado :(");
            }
        });

        // Exibe o quadro
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoveSwing();
    }
}
