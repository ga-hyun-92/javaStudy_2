package chapter5;

public enum Transportation {
	BUS(100),		
//	{int fare(int distance) {return distance*BASIC_FARE;}},
	TRAIN(150),
	SHIP(100),
	AIRPLANE(300);
	
	final int BASIC_FARE;
	
	Transportation(int BASIC_FARE) {
		this.BASIC_FARE=BASIC_FARE;
	}
	
//	abstract int fare(int distance);
	int fare(int distance) {
		return distance*BASIC_FARE;
		}
	
	int getBasicFare() {
		return BASIC_FARE;
	}
}
