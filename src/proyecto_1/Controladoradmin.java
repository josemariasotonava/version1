package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public  class Controladoradmin implements ActionListener {
	VadminAlu adm;
	public Controladoradmin(VadminAlu adm) {
		super();
		this.adm=adm;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent j) {
		// TODO Auto-generated method stub
		Object d = j.getSource();

		if (d ==adm.btnFormulario) {
			formu();
	}

}

	private void formu() {
		ArrayList<Persona> p = new ArrayList<Persona>();
		VArrayPersona vPer = new VArrayPersona();
		ControladorTablaPersona controlPer = new ControladorTablaPersona(p, vPer);
		vPer.setControlador(controlPer);
		vPer.setVisible(true);
		adm.dispose();
		
	}
}
