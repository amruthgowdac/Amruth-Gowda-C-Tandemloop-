import java.util.Scanner;
public class Problem4 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		
		//int[] numbers = {1,2,3,4,5,6,7,8,9};
    		
 		int[] array = {1,2,8,9,12,46,76,82,15,20,30};
 		int n = array.length;
 		
 		System.out.print("Output : {"); 		

 		for(int number=1; number<=9; number++) {
 			int count = 0;
 			
 			for(int j=0; j<n; j++) {
 				if(array[j] % number == 0) {
 					count++;
 				}
 			}

 			if(number < 9) {
 	 		System.out.print(number + ":" + count + ", ");
 			} else {
 		 		System.out.print(number + ":" + count + "}"); 		

 			}

 		}
 		 
 		sc.close();
 	}
}