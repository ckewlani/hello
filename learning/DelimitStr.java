package com.selenium.webdriver.learning;

public class DelimitStr {
	
	 String b="Srno,name,Address,Phno,BG,Gender";
	 String a="1,Chandrabhan,c78, sector 1, Raipur,7587145392,o+,Male";

	public static void main(String args[])
	
	{
		DelimitStr wx =new DelimitStr();
		
		
		System.out.println(wx.convert(b, 6, 3, ':'));
	    System.out.println(wx.convert(a, 6, 3, ':'));
		

		
		
	}
	
	String convert(String a,int no_of_col,int col_num,char delimiter_ch ) {
		String y,w,t;
		
		//DelimitStr x=new DelimitStr();
	//if(x.count(a,',')>5) {
		int st=0;
		int st2=0;
		
		for(int i=0;i< col_num-1/*col_num*/;i++)
		st=a.indexOf(',',st)+1;
		st2=st;
		for(int i=0;i< this.count(a, ',')-no_of_col+2/*no_of_col*/;i++)
			st2=a.indexOf(',',st2)+1;
			w=a.substring(0,st);
			t=a.substring(st,st2-1);
			y= a.substring(st2-1,a.length());
                                                 //System.out.println(	a.substring(0,st-1)+"|"+	y.replace(',', '|'));
return w.replace(',', delimiter_ch).concat(t).concat(y.replace(',', delimiter_ch));
			//return t;
			//			return w.replace(',', '|');
	//}
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
