package ba.bitcamp.exercise;

public class Test {
	

	public static void main(String[] args) {
	
		User user = new User("Hajvan", "Životinjić", 24, true);
		System.out.println(user.toCSV(","));
		CSVReadWrite.saveToFile("user", user.toCSV(","));
	}
}
