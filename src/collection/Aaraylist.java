package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class Aaraylist 
{
	public static void main(String[] args)
	{
		System.out.println("changing on behalf of guy X from Asia");
		System.out.println("changing on behalf of guy Y from America from stuffofgit");
		System.out.println("moving to develop branch from master in git clone module");
		System.out.println("another chnange from American guy Y");
		 ///https://beginnersbook.com/2013/12/java-arraylist/ 
		/*ArrayList<Integer> li=new ArrayList<>();
		li.add(2);
		li.add(3);
		li.add(40);
		li.add(34);
		li.add(50);
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		li.add(55);
		System.out.println(li);
		li.add(3, 90);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		li.set(3, 100);
		System.out.println(li);
		li.indexOf(100);
		System.out.println(li.indexOf(100));
		System.out.println(li.get(2)); 
		
		System.out.println("New COncept in lisyt");
		
		ArrayList<Integer> lii=new ArrayList<>();
		lii.addAll(li);
		System.out.println(li);
		System.out.println(lii);
		int sum=0;
		for(int i:lii)
		{
			sum +=i;
			
		}
		System.out.println(sum);
		
		ArrayList<Integer> li3=new ArrayList<>();
		li3.add(99);
		li3.add(44);
		li3.add(33);
		li3.add(11);
		System.out.println("new concept");
		li3.addAll(2, li);
		System.out.println(li3); 
		
		ArrayList<String> name=new ArrayList<>();
		name.add("akash");
		name.add("ak");
		name.add("ram");
		name.add("ram");
		name.add("aam");
		name.add("kam");
		System.out.println(name);
		System.out.println("Sublist");
		ArrayList<String> name2=new ArrayList<String>(name.subList(2, 4));
		System.out.println(name2);
		System.out.println(name.indexOf("ram"));
		System.out.println(name.lastIndexOf("ram"));
		System.out.println(name.contains("aam"));
		System.out.println("-----------------");
		ArrayList<String> name3=new ArrayList<>();
		name3.addAll(name);
		System.out.println(name3);
		System.out.println(name3.containsAll(name));
		
		ArrayList<String> name4=new ArrayList<String>();
		for(String temp:name)
		
			name4.add(name2.contains(temp) ? "Yes":"No");
			System.out.println(name4);
			System.out.println("Swap");
			
			Collections.swap(name, 1, 5);
			System.out.println(name);   
		
		//Strin to int conversion//
		
		String st="12,24,34,56,78";
		String str[]=st.split(",");
		ArrayList<String> list=new ArrayList<String>();
		for(String s:str)
		{
			list.add(s);
		}
		ArrayList<Integer> ints=new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			ints.add(Integer.valueOf(list.get(i)));
			sum+=ints.get(i);
			
		}
		System.out.println(sum);
		System.out.println(ints);
		
		Iterator<Integer> it=ints.iterator();
		while(it.hasNext())
		{
			Integer j=it.next();
			if(j<40)
			{
				it.remove();
			}
			
		}
		System.out.println(ints);
		*/
//		
		int i=7;
		System.out.println(1%2);
		
		String Url="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWhzABna8iUJANw2ZZu1GO_0qs4VZaGiPEwve5tBC1v6lPKNQRAhpIS_SGs6RAud9Q&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		
		String partialCode=Url.split("code=")[1];
		String actualCode=partialCode.split("&scope")[0];
		System.out.println(actualCode);
		
	}
	
}
