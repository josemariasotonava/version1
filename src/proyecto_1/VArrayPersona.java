package proyecto_1;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VArrayPersona extends JFrame {

	private JPanel contentPane;
	JLabel lblNombre;
	JLabel lblApellido;
	JLabel lblEdad;
	JButton btnSalir;
	JTextField textNombre;
	JTextField textApellido;
	JTextField textAnyo;
	JTable table;
	JButton btnInsertar;
	JLabel lblError;
	 JButton buttonAtras;
	 JLabel label;

	

	public VArrayPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(43, 63, 125, 43);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellido.setBounds(43, 117, 125, 43);
		contentPane.add(lblApellido);
		
		lblEdad = new JLabel("ID:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(43, 171, 125, 43);
		contentPane.add(lblEdad);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalir.setBounds(471, 465, 95, 31);
		contentPane.add(btnSalir);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textNombre.setBounds(192, 63, 156, 43);
		contentPane.add(textNombre);
		
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textApellido.setColumns(10);
		textApellido.setBounds(192, 117, 156, 43);
		contentPane.add(textApellido);
		
		textAnyo = new JTextField();
		textAnyo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textAnyo.setColumns(10);
		textAnyo.setBounds(192, 171, 156, 43);
		contentPane.add(textAnyo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 285, 326, 161);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "ID"
			}
		));
		scrollPane.setViewportView(table);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnInsertar.setBounds(471, 285, 95, 31);
		contentPane.add(btnInsertar);
		
		lblError = new JLabel("");
		lblError.setVisible(false);
		lblError.setDoubleBuffered(true);
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblError.setForeground(Color.RED);
		lblError.setBounds(43, 245, 428, 29);
		contentPane.add(lblError);
		
		
		buttonAtras = new JButton("Atras");
		buttonAtras.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonAtras.setBounds(471, 372, 95, 31);
		contentPane.add(buttonAtras);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\uem\\Desktop\\programacion\\proyecto_1\\imagenes\\letusknow.gif"));
		label.setBounds(319, 11, 277, 263);
		contentPane.add(label);
	}
	public void setControlador (ControladorTablaPersona c){
		btnSalir.addActionListener(c);
		btnInsertar.addActionListener(c);
		buttonAtras.addActionListener(c);
		
	}
}
