import java.util.*;
class AddRetrieveRemove
{
	public static void main(String args[])
	{
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Ram");
		al1.add("Shyam");
		System.out.println("Element in first ArrayList: "+al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Rohan");
		al2.add("Pavan");
		al2.addAll(al1);
		System.out.println("Element in first ArrayList: "+al2);
		al2.remove("Shyam");
		System.out.println("Elements of ArrayList after deletion: "+al2);
		
		System.out.println("The element at 0th index is: "+al2.get(0));
	}
}
