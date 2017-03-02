public class Truck extends Car {
	protected int cargo;
  protected String[] things;


	public Truck(String type, String brand, String doors, int c){
		super(type,brand,doors);
    cargo = c;
    things = new String[cargo];

	}

  public int getCargo(){
    return cargo;
  }
  public String getItem(int i){
  return things[i];
	}
	public void honk(){
		//HONK
	}


}
