package com.test;

public class Junit 
{

	public String rev(String s)
	{
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ns=ch+ns;
		}
		return ns;
	}
}
