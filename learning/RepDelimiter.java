package com.selenium.webdriver.learning;
import java.lang.*;
public class RepDelimiter {
	
	
	static String a="this,that,8,6,8,chandu,5,2";

	public static void main(String args[])
	
	{
		
		
		 
		 
		 
		 
		String y;
	RepDelimiter x=new RepDelimiter();
		if(x.count(a,',')>5) {
			int st=0;
			
			for(int i=0;i< x.count(a, ',')-5/*col_num*/;i++)
				st=a.indexOf(',',st)+1;
			
			
			for(int i=0;i< x.count(a, ',')-5/*no_of_col*/;i++)
				st=a.indexOf(',',st)+1;
				
				y= a.substring(st,a.length());
	System.out.println(	a.substring(0,st-1)+"|"+	y.replace(',', '|'));
		}
		
		
	}
	
	int count(String s, char c) 
	{ 
	    // Count variable 
	    int res = 0; 
	  
	    for (int i=0;i<s.length();i++) 
	    {
	        // checking character in string 
	    
	    char ch[]=	s.toCharArray();
	        if (ch[i] == c) 
	            res++; 
	    }
	    return res; 
	} 

}
