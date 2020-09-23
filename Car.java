package Work;

public class Car {
	
	private String brake;
	private String steering;
	private String accelerator;
	private String clutch;
	

public String moveForward(){
	
 return "moving forward";
	
}
	

public String reverse(){
		
	return "reverse";
}
	
	
 public String stop(){
			
	return "stop";
}

public String signal(){
			
	return "signal";
	
}

public static void main(String[]args){
	
	Car carObj = new Car();
	
	carObj.moveForward();
	carObj.reverse();
	carObj.stop();
	carObj.signal();
	

}

}

	
