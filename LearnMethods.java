package week1.day2;

public class LearnMethods {
 public static void main(String[] args ) {
	 LearnMethods obj = new LearnMethods();
	 obj.printCarName();
	 
	 int carRegNumber = obj.getCarRegNumber();
	  System.out.println(carRegNumber);
	  
	 String getCarVariant = obj.getCarVariant();
	 System.out.println(getCarVariant);
	 
	 float multipleTwoNumbers = obj.multipleTwoNumbers ( 140F, 145F );
	 System.out.println (multipleTwoNumbers);
	 
 }
 public void printCarName() {
	 System.out.println ("Kia");
	 
 }
 public int getCarRegNumber() {
	 int getCarRegNumber = 4455;
	 return getCarRegNumber;
	 
 }
 public String getCarVariant() {
	 return "S2";
 }
 public float multipleTwoNumbers ( float a, float b) {
	 return a+b;
 }
}


main