package proyecto_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ControladorTablaPersona implements ActionListener{
	int n=0;
	ArrayList<Persona> personas;
	VArrayPersona vPer;
	public ControladorTablaPersona(ArrayList<Persona> personas, VArrayPersona vPer) {
		super();
		this.personas = personas;
		this.vPer = vPer;
		
		cargarLista();
	}
	private void cargarLista() {
		// TODO Auto-generated method stub
		for (Persona p : personas){
			//System.out.println(p.getNombre());
			DefaultTableModel tabla = (DefaultTableModel) vPer.table.getModel();
			tabla.addRow(new Object[]{p.getNombre(),p.getApellido(),p.getAnyoNcto()});
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object obj = arg0.getSource();
		if (obj==vPer.btnSalir){
			vPer.dispose();
		}
		if (obj==vPer.btnInsertar){
			insertar();
		}
		
		if(obj==vPer.buttonAtras) {
			atras();
			
		}
		
		
	}
	private void atras() {
		// TODO Auto-generated method stub
		Vprosesor cero =new Vprosesor ();
		Controladorprofesor ci=new Controladorprofesor(cero);
		cero.setControladorprofesor(ci);
		cero.setVisible(true);
		vPer.dispose();
	}
	private void insertar() {
		// TODO Auto-generated method stub
		if (vPer.textNombre.getText().equals("") 
				|| vPer.textApellido.getText().length()==0){//si algún campo está en blanco
			vPer.lblError.setVisible(true);
			vPer.lblError.setText("Hay que rellenar todos los campos");
		}
		else {
			try{
				personas.add(new Persona(vPer.textNombre.getText(),vPer.textApellido.getText(),Integer.parseInt(vPer.textAnyo.getText())));
		
				DefaultTableModel tabla = (DefaultTableModel) vPer.table.getModel();
				tabla.addRow(new Object[]{personas.get(personas.size()-1).getNombre(),
						personas.get(personas.size()-1).getApellido(),
						personas.get(personas.size()-1).getAnyoNcto()});
				vPer.textNombre.setText("");
				vPer.textApellido.setText("");
				vPer.textAnyo.setText("");
				vPer.lblError.setVisible(false);
			}catch(NumberFormatException e){
				vPer.lblError.setVisible(true);
				vPer.lblError.setText("Este campo tiene que ser númerico");
			}
		}
	
	}
	
	
	
	
}
