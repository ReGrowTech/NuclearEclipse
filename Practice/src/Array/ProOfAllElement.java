package Array;

import java.util.Scanner;

public class ProOfAllElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you length :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter You "+n+ " element continously: ");
		int pro=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		//int pro=1;
		for(int j=0; j<arr.length; j++)
		{
			pro=pro*arr[j];
		}
		System.out.println(pro);
sc.close();		
}
}
