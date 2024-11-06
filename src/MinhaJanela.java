import javax.swing.*;
import java.awt.*;

public class MinhaJanela extends JFrame {

    private JTextField campo;
    private JButton botao;

    public MinhaJanela() {
        super();
//        FlowLayout layout = new FlowLayout();
        JPanel painel = new JPanel();
        GridLayout layout = new GridLayout(9, 2);

        campo = new JTextField(50);
        botao = new JButton("Botão do Jayme");
        painel.setLayout(layout);
        painel.add(campo);
        painel.add(botao);
        add(painel);
        getContentPane().add(painel);

        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Minha Janela muito massa");
        setVisible(true);
    }
}
