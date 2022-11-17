package testNG;

import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

public class testcase3 {
	@Test
	public void StringReverse() 
	{
		String str = " S.K vanhsiaJ", reverse = "";
		char chars[] = str.toCharArray();
		for (int i=chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
			reverse = reverse + chars[i];
		}
		System.out.println();
		System.out.println(reverse);
	}
	@Test
	public void SwapTwoNumbers()
	{
		int x,y,temp;
		System.out.print("enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		temp = x;
		x=y;
		y=temp;
		System.out.println("After swapping" + x + y);
	}
	@Test
	public void countwords()
	{
		String str = "This is super csk super Csk csk cskk";
		String [] split = str.split(" ");
			HashMap<String,Integer> map =  new HashMap<String,Integer>();
			for (int i=0; i<split.length; i++) {
				if (map.containsKey(split[i])) {
					int count = map.get(split[i]);
					map.put(split[i], count+1);
				}
				else {
					map.put(split[i], 1);
				}
			}
			System.out.println(map);
	}
}
