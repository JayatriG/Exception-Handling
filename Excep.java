class Excep
{
	static void method1()
	{
		System.out.println("in method 1,calling method 2");
		method2();
		System.out.println("Returned from method 2");
	}
	static void method2()
	{
		System.out.println("in method2, calling method 3");
		try
		{
			method3(4,2);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
		System.out.println("Returnted from method 3");
	}
	static void method3(int a, int b)
	{
		System.out.println("in method 3");
		int c;
		c=a/b;
		System.out.println("method 3 exits");
	}
	public static void main(String args[])
	{
		method1();
	}
}