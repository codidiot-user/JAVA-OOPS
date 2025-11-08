package ClassAndObj;


class Car{
	String cName;
	int modelNo;
	int seatCount;
	Car(){
		cName = "alto";
		modelNo = 123;
		seatCount = 4;
	}
	Car(String cName, int modelNo, int seatCount){
		this.cName = cName; 
		this.modelNo = modelNo;
		this.seatCount = seatCount;
	}
	Car(Car model){  
		this.cName = model.cName; 
	}
}




public class Class1 { 

	public static void main(String[] args) {
		Car model1 = new Car();
		Car model2 = new Car("BMW",456,2);
		Car model3 = model1;
		System.out.println(model1.cName);  
		System.out.println(model1.modelNo);
		System.out.println(model2.cName); 
		System.out.println(model3.cName);
		
	}

}
