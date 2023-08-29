import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RomanticSwing {

   public static void main(String[] args) {

      // Cria uma nova janela
      JFrame janela = new JFrame("RomanticSWING");
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setPreferredSize(new Dimension(300, 200));

      // Cria um novo painel
      JPanel painel = new JPanel();

      // Cria uma nova etiqueta
      JLabel etiqueta = new JLabel("Oii gatinha SS22");

      // Define a fonte e a cor da etiqueta
      etiqueta.setFont(new Font("Open Sans", Font.BOLD, 20));
      etiqueta.setForeground(Color.PINK);

      // Adiciona a etiqueta ao painel
      painel.add(etiqueta);

      // Adiciona o painel à janela
      janela.getContentPane().add(painel);

     

      // Exibe a janela
      janela.pack();
      janela.setVisible(true);
   }
}

