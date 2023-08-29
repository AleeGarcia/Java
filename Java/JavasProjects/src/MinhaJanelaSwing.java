import javax.swing.*;

public class MinhaJanelaSwing extends JFrame {

    public MinhaJanelaSwing() {
        JLabel label = new JLabel("Oiiii gatinha S2");     
        JButton button = new JButton("Vamo casar, sim ou sim");  

        JPanel panel = new JPanel();
        panel.add(label);   // Insere o label no panel
        panel.add(button);  // Insere o button no panel

        add(panel);         // Insere o panel no frame

        setSize(400, 100);   // Define o tamanho do frame para 300x100
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação para fechar o frame
    }

    public static void main(String[] args) {
        MinhaJanelaSwing ex = new MinhaJanelaSwing();  // Inicializa o frame
        ex.setVisible(true);  // Apresenta o frame
    }
}