package programs;
import entities.Lampada;

public class ProgramLampada {
	public static void main(String[] args) {
		
		Lampada roomLamp = new Lampada();
		System.out.println(roomLamp.getState());
		
		roomLamp.setState(true);
		System.out.println(roomLamp.getState());

	}
}
