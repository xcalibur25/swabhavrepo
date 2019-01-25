package com.techlabs.append;
import java.io.*;
public class AppendToFile {
	public static void appendStrToFile(String fileName, 
            String str) 
{ 
try { 

// Open given file in append mode. 
BufferedWriter out = new BufferedWriter( 
new FileWriter(fileName, true)); 
out.write(str); 
out.close(); 
} 
catch (IOException e) { 
System.out.println("exception occoured" + e); 
} 
} 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fileName = "Output.txt"; 
        try { 
            BufferedWriter out = new BufferedWriter( 
                          new FileWriter(fileName)); 
            out.write("Hello World:\n"); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("Exception Occurred" + e); 
        } 
  
        // Let us append given str to above 
        // created file. 
        String str = "This is Yash Raorane "+ "I am currently pursuing BE from Atharva College"; 
        appendStrToFile(fileName, str); 
  
        // Let us print modified file 
        try { 
            BufferedReader in = new BufferedReader( 
                        new FileReader("Output.txt")); 
  
            String mystring; 
            while ((mystring = in.readLine()) != null) { 
                System.out.println(mystring); 
            } 
        } 
        catch (IOException e) { 
            System.out.println("Exception Occurred" + e); 
        } 
    } 


	}


