

public class static_use_case {

	public static void main(String[] args) {
		greet(); // If you need to call the method inside the 'main', the calling method should be static
		static_use_case obj = new static_use_case();
		obj.greet(); // Else that should be in an 'object' then only we can call inside the main

	} 
	 void greet() { // If we use 'static' then it will normal... If we create any method, there is no need to use the 'static' keyword
		System.out.println("This is dummy");
	}

}
