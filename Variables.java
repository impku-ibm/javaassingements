package helloworld;

public class Variables {

	public static void main(String[] args) {
		byte myByte = 100;
		byte newByte = (byte)(myByte/2);
		System.out.println(newByte);
	short myShort = 32357;
	short newShort = (short)(myShort/2);
	System.out.println(newShort);
	int myInt =100000;
	int newInt = (myInt/2);
	System.out.println(newInt);
	long myLong = 50000L +((myByte+myShort+myInt)*10L);
	System.out.println(myLong);
	
	
	
	
	}
}