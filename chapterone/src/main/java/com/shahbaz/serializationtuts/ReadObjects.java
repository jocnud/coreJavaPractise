package com.shahbaz.serializationtuts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		FileInputStream i;
		try {
			i = new FileInputStream("writeedobjects.txt");
			ObjectInputStream is = new ObjectInputStream(i);
			Person copiedP1 = (Person) is.readObject();
			Person copiedP2 = (Person) is.readObject();
			System.out.println(copiedP1);
			System.out.println(copiedP1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
