
public class programCounter {
	private static programCounter instance= new programCounter();
	private programCounter(){};
	
	public static programCounter getInstance(){
		return instance;
	}
	public void msg(){
		System.out.println("Singleton");
	}

}

