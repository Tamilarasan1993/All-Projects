package com.Practicing;

public class DEmoO {
	
		public static void reverse() {
		String t = "Tamil Arasan";
		int count = t.length();
		System.out.println("Length of Stirng is " +count);
		for(int i =t.length()-1;i>=0;i--) {
			
			System.out.print(t.charAt(i));
		}
		}
		public static void split1() {
		System.out.println("\nAfter Split");
		String t1 ="Tamil Arasan";
		String[] tt=t1.split("");
		for(int i = 0;i<=tt.length-1;i++) {
			System.out.println(tt[i]);
		}
		}
		public static void Split2() {
		System.out.println("\nSPLIT");
		String t2= "Tamil Arasan";
		String[] dd=t2.split(" ");
		for (int i =0;i<=dd.length-1;i++) {
			System.out.println(dd[i]);
		}
		}
		public static void replaceAll() {
		String tom= "123Tom $$$ Sts %%%00";
		String ss=tom.replaceAll("[^A-Za-z]","");
		System.out.println(ss);
		}
		public static void Empty() {
			String q="";
			boolean b = q.isEmpty();
			System.out.println(b);

			String a ="Contains";
			boolean b1 = a.contains("o");
			System.out.println(b1);
			String p = a.toUpperCase();
			System.out.println(p);
			try {
				char as = a.charAt(8);
				System.out.println(as);	
			} catch (Exception e) {
				e.printStackTrace();
			}	
		System.out.println(a.substring(2,5));
		String aa= a.substring(6);
		System.out.println(aa);
		
}
		
		
		public static void main(String[] args) {	
			
			Split2();
		}
		

}
