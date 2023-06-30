class Familymembers{
	void print() {
		System.out.println("We have a joint family");
	}
}
class Grandparents{
	void print() {
		System.out.println("I have 2 grandparents ");
		}
	}
class Uncles extends Grandparents{
	void print(){
		System.out.println("I have 3 uncles");
		}
}
class Cousins extends Uncles{
void print() {
	System.out.println("I have 5 cousins ");
	}
}
public class Polymorphism extends Cousins {
	public static void main(String[] args) {
Familymembers s= new Familymembers();
Grandparents k=  new Grandparents();
Uncles j = new Uncles();
Cousins l=new Cousins();

s.print();
k.print();
l.print();
j.print();   // if only one method is called = method overriding
}}
