package c.exception;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomException sample = new CustomException();

		try {
			sample.throwMyException(13);
		} catch (MyException mye) {
			// TODO Auto-generated catch block
			mye.printStackTrace();
		}
	}

	public void throwMyException(int number) throws MyException {
		try {
			if (number > 12) {
				throw new MyException("Number is over than 12");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
