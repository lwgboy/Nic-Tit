package com.litt.micro.util.TermNumber;

public class TermNumber {
	
	public static String TermNumberConvert(String sNum)
	{

		switch(sNum)
		{
		case "0": return "02";
		case "1":return "01";
		default :return "01";
		
		}
		
	}
	public static String TermNumberScore(String sNum)
	{
		switch(sNum)
		{
		case "0": return "01";
		case "1": return "02";
		default : return "01";
		}
	}

}
