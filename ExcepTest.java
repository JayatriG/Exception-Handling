class ExcepTest
{
	public static void main(String args[]){
	try
	{
        	int a[] = new int[]{5,15,45};
        	System.out.println("Access element four :" + a[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Exception thrown  :" +e);
        }
	finally
	{
		System.out.println("Finally block");
	}
      System.out.println("Out of the block");
   }
}
