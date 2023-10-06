import java.util.*;
public class MinMaxFinder {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the array size");
 int size=sc.nextInt();
 int arr[]=new int[size];
 System.out.println("Enter the elements in the array");
 for(int i=0;i<size;i++)
 {
	 arr[i]=sc.nextInt();
 }
 Arrays.sort(arr);

 System.out.println("Smallest element: " + arr[0]);
 System.out.println("Largest element: " + arr[arr.length - 1]);
 }
}
