package SplitArrayString;

import java.util.Arrays;

public class SplitStringToArray {

	public static String splitStringArray(String someName) {
		String result=Arrays.toString(someName.split("a")); //String to array converted
		return result;
	}
	public static void splitString() {
		String input="String, Functions, Split, Methods, Demo";
		String[] splitArray= input.split(", "); //String to Array converted
		for (int i=0; i < splitArray.length; i++)
		{
		System.out.println(splitArray[i]);
		}
	}
}
