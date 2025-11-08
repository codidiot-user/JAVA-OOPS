package ClassAndObj;

class Os{
	void first() {
		System.out.println("Windows 7");
	}
} 
class Second extends Os{
	void second() {
		System.out.println("Windows 8");
	}
}

class Third extends Second{
	void third() { 
		System.out.println("Windows 10");
	}
}

public class inherit {

	public static void main(String[] args) {
		Os one = new Os();
		Second two = new Second();
		Third third = new Third();
		third.first();
		third.second(); 
		third.third();
		
	}

}
