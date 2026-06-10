package aula3;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class aula3 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha Janela");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel texto = new JLabel("Olá, Swing!", JLabel.CENTER);
        janela.add(texto);

        janela.setVisible(true);
    }
}

