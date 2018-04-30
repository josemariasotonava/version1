package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno implements ActionListener {
	Valumno alum;
	
	public ControladorAlumno(Valumno alum) {
		super();
		this.alum=alum;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent f) {
		// TODO Auto-generated method stub
		Object y = f.getSource();

		if (y ==alum.btnEntrar) {
			empezar();
		}
		if(y==alum.btnAtras) {
			atras();
		}
		if(y==alum.btnSalir){
				alum.dispose();
		}
		
			
	}
	private void atras() {
		Inicio cero =new Inicio ();
		ControladorInicio ci=new ControladorInicio(cero);
		cero.setControlador(ci);
		cero.setVisible(true);
		alum.dispose();
		
	}

	private void empezar() {
	

}
}
