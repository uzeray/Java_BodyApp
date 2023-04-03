// assign to in which package will take place
package FirstApp;

// assign to class BodyIndexer
public class BodyIndexer {
	
	// assign to variables for class
	private String a; // a=name
	private int b, e; // b = age - e = gender
	private double c, d; // c=weight d=height
	
	// assing to public variables for use in class
	public double BMR; // basal metabolic rate
	public double BMI; // body mass index
	
	// assign to constructor function for class
	public BodyIndexer(String a, int b, double c, double d) {
		// use the private variable for constructor with assignment
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	// assign to function for BMI Callculation and get variables in (weight, height)
	public double BMI(double c, double d) {
		
		// BMI calculation formulation weight * ((height / 100) * (height / 100))
		BMI = c / ((d/100) * (d/100));
		
		// print to result to console
		System.out.println("Body Mass Index ; " + BMI);
		
		// return BMI result
		return BMI;
	}
	
	// assign BMR function and get variables in (age, weight, height, gender(1 is male/2 is female))
	public double BMR(int b, double c, double d, int e) {
		
		// if gender is male (1) will calculate to BMR for mans
		if(e == 1) {
			BMR = 88.362 + (13.397 * c) + (4.799 * d) - (5.677 * b);
		}
		
		// if gender si female (2) will calculate to BMR for womens
		if (e == 2) {
			BMR = 447.593 + (9.247 * c) + (3.098 * d) - (4.330 * b);
		}
		
		
		// print to BMR result console
		System.out.println("Basal Metabolic Rate : " + BMR);
		
		
		// return BMR result
		return BMR;
	}
	
	

}
