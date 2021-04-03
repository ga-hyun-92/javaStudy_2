package chapter5;

public enum Direction {
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction[] DIR_ARR=Direction.values();
	private final int value;
	private final String symbol;
	
	Direction(int value,String symbol) {
		this.value=value;
		this.symbol=symbol;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public static Direction of(int value) {
		if (value<1||value>4) {
			throw new IllegalArgumentException();
		}
		return DIR_ARR[value-1];
	}
	
	public String toString() {
		return this.name()+getSymbol();
	}
	
	public String rotate(int value) {
		
		if (value<0) {
			value=value+4;
		}
		
		int num=this.getValue()+value;
		if (num>4) {
			num=num%4;
			if (num==0) {
				num=1;
			}
		}
		
		return of(num).toString();
	}
}
