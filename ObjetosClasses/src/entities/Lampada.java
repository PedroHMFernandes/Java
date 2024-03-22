package entities;

public class Lampada {
	private String state = "Apagado";
	
	public void setState(boolean aceso) {
		this.state = aceso? "Aceso" : "Apagado"; 
	}	

	public String getState() {
		return this.state;
	}		
}
