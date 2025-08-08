import java.util.Scanner;
public class Problem3 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("Enter the number (a): "); 		
 		int a = sc.nextInt();
 		
 		int count;
 		for(int i=1;i<=a; i++) {
 			count = i;
 		if(i % 2 == 0) {
 			count -= 1;
 		} else {
 			count = i;
 		}

 		System.out.print(i +")Input a = " + i + ", output:");
 		for(int j=0,num=1; j<count; j++,num += 2) {
 		if(j>0) System.out.print(",");
 			System.out.print(num);
 		}
 		System.out.println();
 		}
 		sc.close();
 	}
}