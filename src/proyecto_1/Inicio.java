package proyecto_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;

public class Inicio extends JFrame {
	JButton btnprofe;
	JButton btnAlumno;
	JButton btnSalir;
	private JLabel lblProfesor;
	private JLabel lblAlumno;
	private JLabel label;
	private JLabel lblNewLabel;
	
	public Inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\WhatsApp Image 2018-04-24 at 16_opt (1).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 610);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAlumno = new JButton("");
		btnAlumno.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\alumno_opt.jpg"));
		btnAlumno.setForeground(Color.BLUE);
		btnAlumno.setBounds(10, 327, 57, 66);
		contentPane.add(btnAlumno);
		
		 btnprofe = new JButton("");
		 btnprofe.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\alumno_opt_opt.png"));
		 btnprofe.setForeground(Color.RED);
		btnprofe.setBounds(10, 92, 57, 66);
		contentPane.add(btnprofe);
		
		btnSalir = new JButton("");
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\salir-de-mi-perfil-icono-3964-128_opt.png"));
		btnSalir.setBounds(10, 215, 70, 66);
		contentPane.add(btnSalir);
		
		lblProfesor = new JLabel("Profesor");
		lblProfesor.setFont(new Font("Kartika", Font.BOLD, 11));
		lblProfesor.setForeground(Color.RED);
		lblProfesor.setBounds(20, 169, 57, 14);
		contentPane.add(lblProfesor);
		
		lblAlumno = new JLabel("Alumno");
		lblAlumno.setForeground(Color.RED);
		lblAlumno.setFont(new Font("Kartika", Font.BOLD, 11));
		lblAlumno.setBounds(10, 400, 57, 14);
		contentPane.add(lblAlumno);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\ezgif.com-video-to-gif (1).gif"));
		label.setBounds(10, 513, 342, 48);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\WhatsApp Image 2018-04-20 at 09_opt.jpg"));
		lblNewLabel.setBounds(0, 0, 849, 572);
		contentPane.add(lblNewLabel);
		
	}
	public void setControlador(ControladorInicio c) { 
	
		btnAlumno.addActionListener(c);
		btnprofe.addActionListener(c);
		btnSalir.addActionListener(c);


		
	}
}
