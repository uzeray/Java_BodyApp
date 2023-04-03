package FirstApp;

public class FirstApp {

	public static void main(String[] args) {
		
		BodyIndexer person = new BodyIndexer("Unal", 30, 70.0, 168.0);
		person.BMI(70.0, 168.5);
		person.BMR(32, 70.5, 168.5, 1);

	}

}