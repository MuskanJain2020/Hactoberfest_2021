import java.util.Scanner;
/*You are given an array of integers , you need to find the maximum sum that can be obtained by picking some non-empty subset of the array. If there are many such non-empty subsets, choose the one with the maximum number of elements.
 *  Print the maximum sum and the number of elements in the chosen subset.
 */

public class Ques2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     
		
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println();
		for (int k = 0 ; k<n ; k++) {
			 a[k] = sc.nextInt();
		}
		int flag= 0;int max = 0;int sum= 0 ; int length = 0;
		 for (int i = 0 ;i <n ; i++ ) {
			if (flag == 0 ) {
				max = a[i];
				flag = 1;
				
			}
			if(max<a[i]) {
			       max=a[i];
			}  // if a[i] is greater than 0 than add it to the sum
		      if(a[i]>=0)
		      {
		          sum=sum+a[i];
		          length++;
		      }
		    }
             
		    // if there is no any positive number then 
		    if(sum==0 && length==0)
		    {
		        System.out.println(max + " " + "1");
		    }

		    // if a[i] have positive number then
		    else { System.out.println(sum + " " + length);
		    }
		    
		     
		   
				
				
			} 
			 
		 
		
