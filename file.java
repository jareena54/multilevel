class GrandFather
{
	public void land()
	{
		System.out.println("2 acres land");
	}
}
class Father extends GrandFather
{
	public void home()
	{
		System.out.println("3 BHK home");
	}
}
class Son extends Father
{
	public void bike()
	{
		System.out.println("KTM Bike");
	}
}

public class MultiLevel 
{
	public static void main(String[] args)
	{
		Son ss = new Son();
		ss.land();  ss.home();  ss.bike();
	}

}