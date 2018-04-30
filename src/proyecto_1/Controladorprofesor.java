package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controladorprofesor implements ActionListener {

	Vprosesor vp;
	public Controladorprofesor(Vprosesor vp) {  
		this.vp=vp;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o=e.getSource();
		
		if(o==vp.Crear){
			crear();
	}
		if(o==vp.CrearA) {
			crearA();
			
		}

}
	private void crearA() {
		// TODO Auto-generated method stub
		ArrayList<Persona> p = new ArrayList<Persona>();
		VArrayPersona vPer = new VArrayPersona();
		ControladorTablaPersona controlPer = new ControladorTablaPersona(p, vPer);
		vPer.setControlador(controlPer);
		vPer.setVisible(true);
		vp.dispose();
		
	}
	private void crear() {
		// TODO Auto-generated method stub
		VcrearP p= new VcrearP ();
		p.setVisible(true);
		vp.dispose();
		
	}
}
