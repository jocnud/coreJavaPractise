package com.shahbaz.serializationtuts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteMultipleObjects {

	public static void main(String[] args) {
		
		FileOutputStream fo;
		try{
			fo=new FileOutputStream("writing-mutiple.txt");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			
			ArrayList<Person> list=new ArrayList<Person>();
			list.add(new Person(10,"Shhbaz "));
			list.add(new Person(11,"Deepa "));
			list.add(new Person(12,"Priya "));
			
			os.writeObject(list);
			
			os.close();
			fo.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
