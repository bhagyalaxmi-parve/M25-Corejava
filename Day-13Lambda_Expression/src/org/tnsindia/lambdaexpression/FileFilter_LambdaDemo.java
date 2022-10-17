package org.tnsindia.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilter_LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda expression to search a file in the given location
				FileFilter filter=(File pathname)->pathname.getName().endsWith(".txt");
				File dir=new File("C:\\Users\\user\\Desktop");
				File contents[]=dir.listFiles(filter);
				for(File itr:contents)
				{
					System.out.println(itr);
				}

	}

}
