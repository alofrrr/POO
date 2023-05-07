package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controller.LivroCategoriaController;
import Model.LivroCategoria;

@SuppressWarnings("serial")
public class LivroCategoriaView extends JFrame {
    private LivroCategoriaController livroCategoriaController;

    public LivroCategoriaView() {
        livroCategoriaController = new LivroCategoriaController();
        initComponents();
    }
    
        

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca - Livros e Categorias");
        setResizable(false);
        setSize(600, 400);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Livros e Categorias");
        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        JButton vincularButton = new JButton("Vincular Livro a Categoria");
        vincularButton.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(vincularButton);
        
        JButton consultarButton = new JButton("Consultar Vinculados");
        consultarButton.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(consultarButton);
        
        add(mainPanel);

        vincularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vincularLivroCategoria();
            }
        });
        
        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarVinculados();
            }
        });
        


    }
    
    private void vincularLivroCategoria() {
        String idLivro = JOptionPane.showInputDialog(this, "Digite o ID do Livro:");
        String idCategoria = JOptionPane.showInputDialog(this, "Digite o ID da Categoria:");
        
        livroCategoriaController.cadastrarLivroCategoria(idLivro, idCategoria);
        JOptionPane.showMessageDialog(this, "Livro vinculado a Categoria com sucesso");
    }
    
    private void consultarVinculados() {

        List<LivroCategoria> listaLivrosCategorias = livroCategoriaController.getLivroCategoria();



        if (listaLivrosCategorias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há livros vinculados a categorias.");
            return;
        }

        String mensagem = "Livros vinculados a categorias:\n";

        for (LivroCategoria lc : listaLivrosCategorias) {
            mensagem += "\nID do livro: " + lc.getIdLivro() + "\nId da Categoria: " + lc.getIdCategoria() + "\n";

          
        }

        JOptionPane.showMessageDialog(this, mensagem);
    }

    







}






