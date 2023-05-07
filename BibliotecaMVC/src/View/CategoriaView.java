package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Model.Categoria;
import Controller.CategoriaController;

@SuppressWarnings("serial")
public class CategoriaView extends JFrame {
	private CategoriaController categoriaController;
	
	public CategoriaView() {
	    categoriaController = new CategoriaController();
	    initComponents();
	}


	    private void initComponents() {
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Biblioteca - Categorias");
	        setResizable(false);
	        setSize(400, 300);

	        JPanel mainPanel = new JPanel();
	        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

	        JLabel titleLabel = new JLabel("Categorias");
	        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
	        titleLabel.setAlignmentX(CENTER_ALIGNMENT);
	        mainPanel.add(titleLabel);

	        JButton inserirButton = new JButton("Inserir Categoria");
	        inserirButton.setAlignmentX(CENTER_ALIGNMENT);
	        mainPanel.add(inserirButton);

	        JButton consultarButton = new JButton("Consultar Categorias");
	        consultarButton.setAlignmentX(CENTER_ALIGNMENT);
	        mainPanel.add(consultarButton);

	        add(mainPanel);

	        inserirButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                inserirCategoria();
	            }
	        });

	        consultarButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                consultarCategorias();
	            }
	        });
	    }

	    private void inserirCategoria() {
	        String idCategoria = JOptionPane.showInputDialog(this, "Digite o ID da Categoria:");
	        String nome = JOptionPane.showInputDialog(this, "Digite o nome da Categoria:");
	       
	       
	        categoriaController.cadastrarCategoria(idCategoria, nome);
	        JOptionPane.showMessageDialog(this, "Categoria inserida com sucesso.");
	    }

	    private void consultarCategorias() {
	        List<Categoria> listaCategorias = categoriaController.getCategorias();
	        if (listaCategorias.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Não há categorias cadastradas.");
	            return;
	        }
	        String mensagem = "Categorias cadastradas:\n";
	        for (Categoria categoria : listaCategorias) {
	            mensagem += "\nID: " + categoria.getIdCategoria() + "\nNome: " + categoria.getNome()  + "\n";
	        }
	        JOptionPane.showMessageDialog(this, mensagem);
	    }


}




