import java.util.*;

public class Main{
	public static void main(String args[]) {
	List<Fruit> list = new ArrayList<Fruit>();
	System.out.println("Fruit List (ordered by name)");
	Fruit f1=new Fruit(101,"Apple",1000);
	list.add(f1);
	Fruit f2=new Fruit(102,"Banana",4000);
	list.add(f2);
	Fruit f3=new Fruit(103,"Kiwi",3000);
	list.add(f3);
	Fruit f4=new Fruit(104,"Pineapple",9000);
	list.add(f4);
	Fruit f5=new Fruit(105,"Applemango",6000);
	list.add(f5);
	Fruit f6=new Fruit(106,"Plum",5000);
	list.add(f6);
	Fruit f7=new Fruit(107,"Mango",2000);
	list.add(f7);
	Fruit f8=new Fruit(108,"Watermelon",10000);
	list.add(f8);
	Fruit f9=new Fruit(109,"Goldenkiwi",3000);
	list.add(f9);
	Fruit f10=new Fruit(110,"Pear",1500);
	list.add(f10);
	Collections.sort(list, new FruitComparator());
	for (Fruit s : list) {
		System.out.println(s.toString());
	}
	System.out.println("Fruit List (reverse order by name)");
	Collections.sort(list, new FruitComparatorDesc());
	for (Fruit s : list) {
		System.out.println(s.toString());
	}
}
}


