package collection;

import java.util.ArrayList;

public class lexques 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> chkpts=new ArrayList<>();
		chkpts.add(0);
		chkpts.add(3);
		chkpts.add(7);
		chkpts.add(2);
		chkpts.add(4);
		chkpts.add(15);
		chkpts.add(2);
		ArrayList<Integer> count=new ArrayList<>();
		
		
		System.out.println(chkpts);
		int ibuy=0-chkpts.get(0);
		int gain=0;
		
		
		int buy=0;
		count.add(ibuy);
		int add=0;
		
		for(int i=0;i<chkpts.size()-1;i++)
		{
			int forward=chkpts.get(i)-chkpts.get(i+1);
			
			if(forward>0)
			{
				gain+=forward;
				
				System.out.println(forward+"gain");
				
			}
			else
			{	
				buy=forward+gain;
					
			}
				count.add(buy);
				
			}
			
				
			
		
		
		System.out.println(count);
		for(int sum:count)
		{
			add+=(sum)*(-1);
			
		}
		
		System.out.println(add);
	}
	
	
	
}
