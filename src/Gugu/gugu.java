package Gugu;

import java.util.Scanner;

public class gugu {
	public static void main(String[] args) {
		
//		int result = 0; 
//		int i,j =0;
//	  
//		for (i=1;i<10;i++) { 
//			for(j=1;j<10;j++) { 
//				result=i*j;
//				System.out.print( i+"*"+j+"="+result+"    "); 
//			}System.out.println();
//		}System.out.print( i+"*"+j+"="+result+"    ");
		 
//		for(int n =1;n<10;n++) {
//			System.out.println("2*"+n+"="+2*n);
//		}
		
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("숫자를 입력해 ! :");
//		int n= scanner.nextInt();
//		for(int m=1;m<10;m++) {
//		System.out.println(n+"*"+m+"="+n*m);
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = scanner.nextInt();
		if (n<2 || n>9) {
			System.out.println("지대로 입력하샘");
		}else {
		for(int i=1;i<10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		}	
	}
}