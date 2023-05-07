package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Model.Livro;
import Controller.LivroController;

@SuppressWarnings("serial")
public class LivroView extends JFrame {
    private LivroController livroController;

    public LivroView() {
        livroController = new LivroController();
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca - Livros");
        setResizable(false);
        setSize(400, 300);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Livros");
        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        JButton inserirButton = new JButton("Inserir Livro");
        inserirButton.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(inserirButton);

        JButton consultarButton = new JButton("Consultar Livros");
        consultarButton.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(consultarButton);

        add(mainPanel);

        inserirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inserirLivro();
            }
        });

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarLivros();
            }
        });
    }

    private void inserirLivro() {
        String idLivro = JOptionPane.showInputDialog(this, "Digite o ID do livro:");
        String nome = JOptionPane.showInputDialog(this, "Digite o nome do livro:");
        String autor = JOptionPane.showInputDialog(this, "Digite o autor do livro:");
        String anoString = JOptionPane.showInputDialog(this, "Digite o ano de publicação do livro (formato yyyy-MM-dd):");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date ano_publicacao = null;
        try {
            ano_publicacao = format.parse(anoString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter data.");
            return;
        }
        livroController.cadastrarLivro(idLivro, nome, autor, ano_publicacao);
        JOptionPane.showMessageDialog(this, "Livro inserido com sucesso.");
    }

    private void consultarLivros() {
        List<Livro> listaLivros = livroController.getLivros();
        if (listaLivros.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há livros cadastrados.");
            return;
        }
        String mensagem = "Livros cadastrados:\n";
        for (Livro livro : listaLivros) {
            mensagem += "\nID: " + livro.getIdLivro() + "\nNome: " + livro.getNome() + "\nAutor: " + livro.getAutor() + "\nAno de publicação: " + livro.getAno_publicacao().toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, mensagem);
    }

}
