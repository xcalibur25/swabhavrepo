package com.techlabs.read_a_file;
import java.io.*;
public class readfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\yash raorane\\swabhav_repository\\hello.txt");
		BufferedReader br =new BufferedReader(new FileReader(file));
		
		String st;
		while((st=br.readLine())!= null) {
			System.out.println(st);
		}
		

	}

}
