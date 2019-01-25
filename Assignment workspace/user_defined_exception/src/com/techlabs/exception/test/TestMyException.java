package com.techlabs.exception.test;
import com.techlabs.exception.*;
public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	throw new MyException("Hello World");
}
 catch(MyException e){
	 System.out.println("Exception caught");
	 System.out.println(e.getMessage());
 }
	}

}
