package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsMethodProgram {
	public static void main(String[] args)
	{
	List<String> i1=new ArrayList<String>();
	i1.add("Roopa");
	i1.add("Atul");
	i1.add("Krishiv");
	System.out.println("Before sorting:"+i1);
	Collections.sort(i1);
	System.out.println("After sorting:"+i1 );
	
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(-5);
	l1.add(55);
	l1.add(-5);
	l1.add(0);
	l1.add(-5);
	l1.add(76);
	
	int index=Collections.binarySearch(l1, -5);
	System.out.println("Binary search:"+index);
	
	System.out.println("Before sorting:"+l1);
	Collections.sort(l1);
	System.out.println("After sorting:"+l1);
	
	Collections.shuffle(l1);
	System.out.println("After shuffling:"+l1);
	
	Collections.reverse(l1);
	System.out.println("After reversing:"+l1);
	
	
	
	Collection<Integer> c1=Arrays.asList(10,20,30,30,40,10,20,10);
	System.out.println("Min:"+Collections.min(c1));
	System.out.println("Min:"+Collections.max(c1));
	System.out.println("Frequency of 10:"+Collections.frequency(c1, 10));
	System.out.println("Frequency of 20:"+Collections.frequency(c1, 20));
	System.out.println("Frequency of 30:"+Collections.frequency(c1, 30));
	System.out.println("Frequency of 40:"+Collections.frequency(c1,40));
	
	Collection<String> str=Arrays.asList("Roopa","prathvi","Roopa");
	System.out.println("Frequency of R: "+Collections.frequency(str, "Roopa"));
	System.out.println("Frequency of o: "+Collections.frequency(str, "prathvi"));
	
	
	
	
	List<Integer> i3=new ArrayList<>(Arrays.asList(1,2,3,4,5));
	Collections.rotate(i3, 8);
	System.out.println("After Positive rotation:"+i3);//clockwise
	
	List<Integer> i4=new ArrayList<>(Arrays.asList(1,2,3,4,5));
	Collections.rotate(i4, -9);
	System.out.println("After Negative rotation:"+i4);//Anticlockwise
	
	Map<Integer,String> modifiableMap=new HashMap<>();
	modifiableMap.put(1, "Java");
	modifiableMap.put(2, "Python");
	modifiableMap.put(3, "C++");
	/*Map<Integer,String> unmodifiableMap=Collections.unmodifiableMap(modifiableMap);
	
	System.out.println("UnmodifiableMap:"+unmodifiableMap);
	unmodifiableMap.put(4, "Javascript");
	System.out.println(unmodifiableMap);
	*/
	List<String> s1=new ArrayList<>(Arrays.asList("Java","C++","Python"));
	
	Collections.fill(s1, "Unknown");
	System.out.println(s1);
	
	List<String> src=Arrays.asList("Java","Python","C++");
	System.out.println("Source:"+src);
	List<String> dst=Arrays.asList("A","B","C");
	System.out.println("Destination:"+dst);
	Collections.copy(src, dst);
	System.out.println("After copy:"+src);
	
	List<String> list=new ArrayList<>(Arrays.asList("Java","Python","Java","JavaScript","Java"));
	Collections.replaceAll(list, "Java", "Kotlin");
	System.out.println(list);
	
	Set<String> singletonSet=Collections.singleton("Selenium");
	try
	{
		singletonSet.add("Java");
	}
	catch(UnsupportedOperationException e)
	{
		System.out.println("Can't modify singleton set");
	}
	List<Integer>L1=Collections.singletonList(5);
	try
	{
		L1.add(10);
	}
	catch(UnsupportedOperationException e)
	{
		System.out.println("Can't modify singleton list");
	}
	Map<String,Integer> m1=Collections.singletonMap("Java", 100);
	System.out.println(m1);
	try {
		m1.put("Python", 200);
	}
	catch(UnsupportedOperationException e)
	{
		System.out.println("Can't modify singleton Map ");
	}
	
	List<String> list1=new ArrayList<>();
	List<String> syncList=Collections.synchronizedList(list1);
	//Adding elements to the synchronozed list
	syncList.add("Java");
	syncList.add("Python");
	System.out.println(syncList);
	
	
	
	
}
}