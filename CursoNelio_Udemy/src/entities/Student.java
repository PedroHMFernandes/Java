package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2  + grade3;
	}
	
	public String wasApproved() {
		if(finalGrade() >= 60.00) {
			return "Approved";
		}
		else {
			double missing = 60.00 - finalGrade();
			return "Failed: " + "missing " 
					+ String.format("%.2f", missing) + " points";
					
		}
	}
	
	
	
}	