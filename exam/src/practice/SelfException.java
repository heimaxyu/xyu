package practice;

public class SelfException {

	public static void main(String[] args) 
	{
		int[] arr = null;
		try {
			MyException.num(arr);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("我的异常");
		}
		catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("f的异常");
		}

}
}

class MyException extends Exception
{	
	private String message;
	MyException(String message)
	{
		super(message);
		this.message=message;
	}
	public static int num(int arr[]) throws MyException 
	{
		if (arr== null)
		throw new MyException("我的异常");
		return arr[0];
	}
}
