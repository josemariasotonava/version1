package proyecto_1;
import java.util.ArrayList;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		
		Inicio vb = new Inicio ();
		ControladorInicio cb= new ControladorInicio(vb);
		vb.setControlador(cb);
		vb.setResizable(false);
		vb.setVisible(true);
		vb.setExtendedState(vb.ICONIFIED);
		
	}

}
