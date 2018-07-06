package jumpsearch;

import java.util.Scanner;

public class JumpSearch {

	public static int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;
 
        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));
 
        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
 
        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x)
        {
            prev++;
 
            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }
 
        // If element is found
        if (arr[prev] == x)
            return prev;
 
        return -1;
    }
 
    // Driver program to test function
    public static void main(String [ ] args)
    {
        int arr[] = { 2,3,6,9,10,20,22,28,30,36,37,40,54,67};
        int x = 2;
 
        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);
 
        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                            " is at index " + index);
    }

//	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		
//		int x = 55;
//		int arr[] =  {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610 };
//		int steps = (int)Math.floor(Math.sqrt(arr.length));
//
//		int pos = j_search(arr,steps,x);
//
//		System.out.println("Position "+pos);
//
//	}
//
//	private static int j_search(int[] arr, int steps,int x) {
//		boolean flag1=false, flag2=false;
//		for(int i=0;i<arr.length;){
//			
//			if(flag1==false){
//				if(arr[i] == x){
//					return i+1;
//				}else if(arr[i]<x){
//					i = i + steps;
//					i = Math.min(i,arr.length-1);
//					/*if(i == arr.length-1 && arr[i] < x){
//						return -1;
//					}*/
//				}else if(arr[i]>x){
//					//System.out.println("out");
//					i = i - steps;
//					flag1=true;
//				}
//			}else{	
//				while(arr[i]!=x){
//					i=i+1;
//					if(i == arr.length-1 && arr[i-1]!=x){
//						return -1;
//					}
//				}
//				//System.out.println("Position : "+(i+1));
//				flag2=true;
//				break;
//				
//			}
//			if(flag2==true){
//				return i+1;
//			}
//		}
//		return -1;
//
//	}

}
