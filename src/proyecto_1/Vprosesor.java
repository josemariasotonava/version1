package proyecto_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Vprosesor extends JFrame {

	 JPanel contentPane;
	  JMenuBar menu;
	  JMenu mP;
	  JMenuItem Crear;
	  JMenuItem Eliminar;
	  JMenuItem Consultar;
	  JMenu mnAlumno;
	  JMenuItem CrearA;
	  JMenuItem EliminarA;
	  JMenuItem ConsularA;
	  JMenu mnArea;
	  JMenuItem CrearAE;
	  JMenuItem EliminarAE;
	  JMenuItem ConsultarAE;
	 JButton button;

	public Vprosesor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\alumno_opt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 518);
		
		menu = new JMenuBar();
		setJMenuBar(menu);
		
		mP = new JMenu("Proyecto");
		mP.setFont(new Font("Vani", Font.PLAIN, 14));
		mP.setBackground(Color.DARK_GRAY);
		mP.setForeground(Color.RED);
		menu.add(mP);
		
		Crear = new JMenuItem("Alta-Proyecto");
		Crear.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138614_opt (1).jpg"));
		mP.add(Crear);
		
		Eliminar = new JMenuItem("Eliminar-Proyecto");
		Eliminar.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138616_opt.jpg"));
		mP.add(Eliminar);
		
		Consultar = new JMenuItem("Consultar-Proyecto");
		Consultar.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138622_opt.jpg"));
		mP.add(Consultar);
		
		mnAlumno = new JMenu("Alumno");
		mnAlumno.setFont(new Font("Vani", Font.PLAIN, 14));
		mnAlumno.setForeground(Color.BLUE);
		menu.add(mnAlumno);
		
		CrearA = new JMenuItem("Crear-Alumno");
		CrearA.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138614_opt (1).jpg"));
		mnAlumno.add(CrearA);
		
		EliminarA = new JMenuItem("Eliminar-Alumno");
		EliminarA.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138616_opt.jpg"));
		mnAlumno.add(EliminarA);
		
		ConsularA = new JMenuItem("Consultar-Alumno");
		ConsularA.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138622_opt.jpg"));
		mnAlumno.add(ConsularA);
		
		mnArea = new JMenu("Area");
		mnArea.setForeground(new Color(128, 0, 0));
		mnArea.setFont(new Font("Vani", Font.PLAIN, 14));
		menu.add(mnArea);
		
		CrearAE = new JMenuItem("Crear-Area");
		CrearAE.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138614_opt (1).jpg"));
		mnArea.add(CrearAE);
		
		EliminarAE = new JMenuItem("Eliminar-Area");
		EliminarAE.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138616_opt.jpg"));
		mnArea.add(EliminarAE);
		
		ConsultarAE = new JMenuItem("Consular-Area");
		ConsultarAE.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\138622_opt.jpg"));
		mnArea.add(ConsultarAE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\14583061acabf11_opt.jpg"));
		label.setBounds(0, 0, 384, 480);
		contentPane.add(label);
		
		button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\salir-de-mi-perfil-icono-3964-128_opt.png"));
		button.setBounds(140, 351, 50, 51);
		contentPane.add(button);
	}
	public void setControladorprofesor(Controladorprofesor dc) {
		Crear.addActionListener(dc);
		CrearA.addActionListener(dc);
		
	}
}
