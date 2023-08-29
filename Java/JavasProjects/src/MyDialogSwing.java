import javax.swing.*;

public class MyDialogSwing extends JDialog {
    public MyDialogSwing(JFrame parent) {
        super(parent);
        setTitle("Meu diálogo");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Este é um diálogo simples.");
        panel.add(label);
        add(panel);
        pack();
        setLocationRelativeTo(parent);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha janela principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        

        JDialog dialog = new MyDialogSwing(frame);
        dialog.setVisible(true);
    }
}
