public class Example {
	private String name= "Flip Robo";
	private	int number= 98;
	
	public int getNumber() {
		return number;}
	
	public void setNumber(int number) {
		this.number = number;}
	
	public String getName() {
		return name;}
	
	public void setName(String name) {
		this.name = name;}
	
	
	public static void printDetails() {
		
		Example e= new Example();

		System.out.println("Name: "+e.getName());
		System.out.println("Number: "+ e.getNumber());
		
	}
public static void main(String[] args) {	

	Example example= new Example();
	
	example.setName("Devesh");
	example.setNumber(123);
System.out.println("My name is "+example.getName());
System.out.println("My number is "+ example.getNumber());

Example.printDetails();
}

}

