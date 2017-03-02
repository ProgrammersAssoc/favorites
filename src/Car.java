
public class Car {

	private String type;
	private String name;
	private  String doors;

	public Car(String type, String brand, String doors){

		this.type = type;
		this.name = brand;
		this.doors = doors;
	}


	public String getType(){
		return this.type;
	}
	public String getName(){
		return this.name;
	}
	public String	getDoors(){
		return this.doors;
	}

	public String	describe(){
		reutnr "The vehicle you're refering to is a" + this.name + " " + this.type + " and has " + this.doors " ."
	}


}
