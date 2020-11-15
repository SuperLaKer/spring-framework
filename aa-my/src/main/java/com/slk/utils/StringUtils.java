package com.slk.utils;


import java.util.Arrays;

public class StringUtils {

	public static String FirstWordToLowerCase(String sourceString){
		char[] chars = sourceString.toCharArray();
		// 需要判断原来是不是小写65-90 A-Z
		if (65<= (int) chars[0] && (int) chars[0] <= 90) chars[0] = (char) (chars[0]+32);
		return new String(chars);
	}

}
