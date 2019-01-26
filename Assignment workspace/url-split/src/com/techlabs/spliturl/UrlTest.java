package com.techlabs.spliturl;

public class UrlTest {

	public static void main(String[] args) {
		String s= args[0];
		String[] segment= s.split("[.//?=&]");
		//for(String m: segment) {
			//System.out.println(m);
		//}
		//System.out.println(segment.length);
		System.out.println("Company name:" +segment[3]);
		System.out.println("Developer name:" +segment[6]);
		System.out.println("Company name:" +segment[9]);
		
		

}
}
