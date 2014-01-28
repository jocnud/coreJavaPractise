package com.shahbaz.serializationtuts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;

public class ReadMulitipleObjects {

	public static void main(String[] args) {
		FileInputStream fi;

		try {
			fi = new FileInputStream("writing-mutiple.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			ArrayList<Person> listRecived = (ArrayList<Person>) oi.readObject();

			for(Person p:listRecived){
				System.out.println(p);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
