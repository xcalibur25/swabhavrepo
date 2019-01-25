package com.techlabs.write_a_file;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	String str = "This is the creation of a new file. "+ "The file is to be written";
	FileWriter fw= new FileWriter("Output.txt");
	for (int i = 0; i < str.length(); i++) 
        fw.write(str.charAt(i)); 
	
	System.out.println("Written successfully to a file");
	
	fw.close();

	}

}
