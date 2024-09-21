package com.TypeCast;

public class Test_Typecast {
	private void cast()
	{
		long a =75873l;
		double i=(double)a;
		System.out.println("Value of Long :"+a);
		System.out.println("Long to double:"+i);
		
	}
	public static void main(String[] args) {
		Test_Typecast test=new Test_Typecast();
		test.cast();
	}

}
