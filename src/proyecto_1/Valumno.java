package proyecto_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Valumno extends JFrame {

	 JPanel contentPane;
	JLabel lblNewLabel = new JLabel("");
	JButton btnEntrar;
	JButton btnSalir;
	JButton btnAtras;
	JTextField textuser;

	
	public Valumno() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\alumno.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 451);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\alumno.jpg"));
		lblNewLabel.setBounds(132, 26, 200, 220);
		contentPane.add(lblNewLabel);
		
		btnEntrar = new JButton("Consultar");
		btnEntrar.setBounds(189, 300, 89, 23);
		contentPane.add(btnEntrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(395, 379, 89, 23);
		contentPane.add(btnSalir);
		
		JTextField textuser = new JTextField();
		textuser.setBounds(142, 257, 206, 20);
		contentPane.add(textuser);
		textuser.setColumns(10);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(395, 323, 89, 23);
		contentPane.add(btnAtras);
		
		JLabel lblId = new JLabel("I.d Proyecto");
		lblId.setForeground(Color.RED);
		lblId.setBounds(35, 260, 89, 17);
		contentPane.add(lblId);
	}
	public void setControladorAlumno(ControladorAlumno a) {
		btnAtras.addActionListener(a);
		btnEntrar.addActionListener(a);
		btnSalir.addActionListener(a);
	}
	
}
