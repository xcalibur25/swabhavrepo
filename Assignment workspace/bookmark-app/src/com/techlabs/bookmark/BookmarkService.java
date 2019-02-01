package com.techlabs.bookmark;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookmarkService {

	public void addBookMark(String filename) throws Exception {
		try {

			// Open given file in append mode.
			BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
			Scanner src = new Scanner(System.in);
			System.out.println("Enter a string");
			String str = src.nextLine();
			out.write(str+"\n");
			out.close();
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
		}

	}

	public void displayBookMark(String filename) throws Exception{
		try {
			Scanner src = new Scanner(System.in);
			File file = new File("Bookmark.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
