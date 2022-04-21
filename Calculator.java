package week1.day2;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println ( obj.Add (100,50,25));
		System.out.println ( obj.Sub (100,50,25));
		System.out.println ( obj.Mul (100,50,25));
		System.out.println ( obj.Div (100,50,5.5));
	}
	public int Add ( int a, int b, int c )
	{
		return a+b+c;
	}
	
	public int Sub ( int a, int b, int c )
	{
		return a-b-c;
	}
	public double Mul ( int a , int b, int c )
	{
		return a*b*c;
	}
	
	public float Div (int a, int b, double c )
	{
		return (float) (a/b/c);
	}
	
}
