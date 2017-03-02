
public class Car {

	private String type;
	private String called;
	private  String doors;

	public Car(String type, String called, String doors){

		this.type = type;
		this.called = called;
		this.doors = doors;
	}


	public String getType(){
		return this.type;
	}
	public String getCalled(){
		return this.called;
	}
	public String	getDoors(){
		return this.doors;
	}

	public String	describe(){
		reutnr "The vehicle you're refering to is a" + this.called + " " + this.type + " and has " + this.doors " ."
	}


}
