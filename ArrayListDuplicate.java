import java.util.*;
class ArrayListDuplicate
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
        		list.add(3);
        		list.add(5);
        		list.add(7);  
        		list.add(7);
        		list.add(1);
		list.add(6);  
        		list.add(5);
        		list.add(4);
		System.out.println("list with duplicates : " + list);
		Set<Integer> list1= new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(list1);
		System.out.println("list without duplicates : " + list);
	}
}