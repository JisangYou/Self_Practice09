package c.exception;

public class ThrowSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowSample sample = new ThrowSample();
		sample.throwException(13);
		try {
			sample.throwsException(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void throwException(int number) {
		try {
			if (number > 12) {
				throw new Exception("Number is over than 12");
			}
			System.out.println("Number is over than 12");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwsException(int number) throws Exception {
	
			if (number > 12) {
				throw new Exception("Number is over than 12");
			}
			System.out.println("Number is over than 12");
		
	}

}
