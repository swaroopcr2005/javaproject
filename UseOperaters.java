package com.project;

public class UseOperaters {
   public static void main(String[] args) {
   int a =3;
//   post increment: use value first then change in memory
   System.out.println(a++);
   System.out.println(a);
	   
	int b =4;
	int c =b--;
	System.out.println(b);
	System.out.println(c);
	System.out.println("c:"+c);
//	check a number is divisible by 3 and 4
	System.out.println(3 == 0);
	System.out.println(3 != 4);
	System.out.println(3 != 3);
	System.out.println("=====");
	System.out.println("logical operater");
	System.out.println("AND (&&)");
	System.out.println(true && true && false);
	System.out.println(true && true && true);
	System.out.println(true && false);
	System.out.println("=========");
    System.out.println("OR (||)");
	System.out.println(false || true || false);
	System.out.println(true || false);
	System.out.println(false || false);
	System.out.println("========");
	System.out.println("NOT (!)");
	System.out.println(!true);
	System.out.println(!false);
	System.out.println("========");
	System.out.println();
	
	int n =10;
//	divisiblity check by (remainder=0) 
	System.out.println(n %3==0 && n%4==0);
	System.out.println("eligible");
	System.out.println("age:22 to 33");
	
	int age =21;
	System.out.println(age >=22 && age <=33);
	









	
   }
	
}

 