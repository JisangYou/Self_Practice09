package c.exception;

public class FinallySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallySample sample = new FinallySample();
		sample.finallySample();
	}
	
	public void finallySample(){
		int [] intArray = new int[5];
		
		try {
			System.out.println(intArray[4]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(intArray.length);
		} finally {
			System.out.println("Here is finally");
		}
		System.out.println("This code must run.");
	}

}
