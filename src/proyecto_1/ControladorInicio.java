package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInicio implements ActionListener{
		Inicio vb;
		
		public ControladorInicio(Inicio vb) { //tengo que poner el constructor a 
			this.vb=vb;
		}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o=e.getSource();
		
		if(o==vb.btnSalir){
			vb.dispose();
		}
		if(o==vb.btnprofe) {
			accederpro();
		}
		if(o==vb.btnAlumno){
			accederalum();
				
			
		}
		
	}

	private void accederalum() {
		Valumno alum= new Valumno();
		
		ControladorAlumno d= new ControladorAlumno(alum);
		alum.setControladorAlumno(d);
		alum.setVisible(true);
		vb.dispose();
		
	
	}

	private void accederpro() {
		// TODO Auto-generated method stub
		Vprosesor prof= new Vprosesor ();
		
		Controladorprofesor b = new Controladorprofesor(prof);
		prof.setControladorprofesor(b);
		prof.setVisible(true);
		vb.dispose();
		
	}

}
