package proyecto_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class VadminAlu extends JFrame {

	 JPanel contentPane;
	 JButton btnFormulario;
	
	public VadminAlu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnFormulario = new JButton("Registro Alumno");
		 btnFormulario.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		 btnFormulario.setForeground(Color.RED);
		btnFormulario.setBounds(164, 32, 173, 31);
		contentPane.add(btnFormulario);
		
		JButton btnRegistroProyecto = new JButton("Registro Proyecto");
		btnRegistroProyecto.setForeground(Color.RED);
		btnRegistroProyecto.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		btnRegistroProyecto.setBounds(164, 87, 173, 31);
		contentPane.add(btnRegistroProyecto);
		
		JButton btnFechaInicio = new JButton("Fecha Inicio");
		btnFechaInicio.setForeground(Color.RED);
		btnFechaInicio.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		btnFechaInicio.setBounds(164, 144, 173, 31);
		contentPane.add(btnFechaInicio);
	}
	public void setControladoradmin (Controladoradmin c){
		btnFormulario.addActionListener(c);
	}
}
