package com.shahbaz.serializationtuts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects ");

		Person p1 = new Person(1, "Shahbaz");
		Person p2 = new Person(2, "Zooby");

		/*
		 * Basically streams data to file, meaning sending data sequentially to
		 * file
		 */
		FileOutputStream f;

		try {
			f = new FileOutputStream("writeedobjects.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(p1);
			o.writeObject(p2);
			o.close();
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
