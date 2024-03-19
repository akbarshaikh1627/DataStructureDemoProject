package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatStringWithout 
{
   
  
    public static void main(String[] args)
    {
    	
    	 
    	String a="akbar";
    	String b="shaikh";
    	
    	//String formattedString = String.format("%s %s", a, b);
    			
    	
    	int totallengthh=a.length()+b.length();
    	
    	char[] tocharArray=new char[totallengthh];
    	
    	for(int i=0;i<a.length();i++)
    	{
    		tocharArray[i]=a.charAt(i);
    	}
    	
    	for(int i=0;i<b.length();i++)
    	{
    		tocharArray[a.length()+i]=b.charAt(i);
    	}
    		
    	String str=new String(tocharArray);
    	
  
    	System.out.println(str);
    	
    	
    	
    	 
    }
}