package Arrays;

import java.util.Scanner;

public class Reverse {

    public static void reverse(int [] arr, int start,int end)
    {

        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        
    }

    // public static void printarr(int [] a,int size)
    // {
    //     for(int i=0;i<size;i++)
    //     {
    //           System.out.print(a[i]+" ");
    //     }




    // }

    
    public static void main(String [] args)
    {

        System.out.println("enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();

        System.out.println("Enter the elements into the array");
        int a[]=new int[size];

        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

       // System.out.println("Array you entered");
 
        //  int b=;
         reverse(a,0,a.length-1);
        
        System.out.println("Reverse of the array");
        //printarr(a,a.length);
        for(int i=0;i<size;i++)
            {
                  System.out.print(a[i]+" ");
            }


        
        


        
   }
    
}
