package org.tnsindia.list;


import java.util.LinkedList;
import java.util.List;



public class DemoOn_ArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List<String> list=new LinkedList<String>();
		list.add("Nisha");
		list.add("Aakash");
		list.add("rutuja");
		
		
		
		//enhanced for loop is used to extract the elements of your ArrayList
				for(String itr:list)
				{
					System.out.println(itr);
				}
		
				
				

	}

}
