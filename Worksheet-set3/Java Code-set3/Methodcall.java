public class Methodcall {
	public static void main(String[] args) {
		Addition add= new Addition();
		System.out.println(add.addTwoInt(5, 90));
	}}

 class Addition {
    int sum= 0;
    
public int addTwoInt(int a, int b) {
	
sum = a+b;

return sum;	
}
}

