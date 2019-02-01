package com.techlabs.bookmark;

import java.io.*;
import java.util.Scanner;

public class Bookmark {

	public static void main(String[] args) throws Exception {
		Scanner src = new Scanner(System.in);
		BookmarkService b = new BookmarkService();
		int choice;
		boolean quit = false;
		String filename = "Bookmark.txt";
		while (!quit) {
			System.out.print("Enter your choice\n");
			choice = src.nextInt();
			src.nextLine();
			switch (choice) {
			case 1:
				b.addBookMark(filename);
				break;

			case 2:
				b.displayBookMark(filename);
				break;

			}
		}

	}

}
