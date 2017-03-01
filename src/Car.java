
public class Car {

	private String type;
	private String brand;
	private  String doors;

	public Car(String type, String brand, String doors){

		this.type = type;
		this.brand = brand;
		this.doors = doors;
	}


	public String getType(){
		return this.type;
	}
	public String getBrand(){
		return this.brand;
	}
	public String	getDoors(){
		return this.doors;
	}

	public String	describe(){
		reutnr "The vehicle you're refering to is a" + this.brand + " " + this.type + " and has " + this.doors " ."
	}


}
