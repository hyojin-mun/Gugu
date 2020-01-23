
import java.util.Scanner;

public class gugu {
	public static void main(String[] args) {
		int[] result = new int[9]; //배열 생성_숫자 9개를 가지는 배열	
		for(int n=1;n<10;n++) {
			for(int i=0;i<result.length;i++) {
				result[i]=n*(i+1);
				System.out.print(n+"*"+(i+1)+"="+result[i]+"	");
			}System.out.println();
		}
	}
}

//int result = 0; 
//int i,j =0;
//
//for (i=1;i<10;i++) { 
//	for(j=1;j<10;j++) { 
//		result=i*j;
//		System.out.print( i+"*"+j+"="+result+"    "); 
//	}System.out.println();
//}System.out.print( i+"*"+j+"="+result+"    ");
//
//for(int n =1;n<10;n++) {
//	System.out.println("2*"+n+"="+2*n);
//}
//
//Scanner scanner =new Scanner(System.in);
//System.out.println("숫자를 입력해 ! :");
//int n= scanner.nextInt();
//for(int m=1;m<10;m++) {
//System.out.println(n+"*"+m+"="+n*m);
//}

//Scanner scanner = new Scanner(System.in);
//System.out.println("숫자 입력 : ");
//int n = scanner.nextInt();
//if (n<2 || n>9) {
//	System.out.println("지대로 입력하샘");
//}else {
//for(int i=1;i<10;i++) {
//	System.out.println(n+"*"+i+"="+n*i);
//}
//}	
