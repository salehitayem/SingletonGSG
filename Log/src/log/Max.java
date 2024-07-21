package log;

public class Max {
	// single instance 
	private static Max instance;
	
	// private constructor to prevent creating another instance 
	private Max() {};
		
	// get math method to find the greater integer :D
	public int getMax(int x, int y) {
		if (x > y) {
			return x;
		}
		return y;
	}
		
	// public method to give access to the instance :X
	public static Max getInstance() {
		
		if (instance == null) {
			synchronized (Max.class ) {
				if (instance == null) {
					instance = new Max();
				}
			}
		}
		return instance;
	}
	
}
