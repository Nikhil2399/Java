public class patterns {
    public static void main(String args [])
    {

         int n =5;
         int m=5;

         //solid rectangle pattern
        /* for(int i=1 ; i<=n; i++)
         {
              for(int j=1 ;j<=m; j++)
              {
                  System.out.print("*");
              }
              System.out.println();
            }
*****
*****
*****
*****
*/

            // hollow rectangle

            /*for(int i=1 ; i<=n; i++)
             {
              for(int j=1 ;j<=m; j++)
              {
                  if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                  }
                  else
                  {
                      System.out.print(" ");
                  }
                  
              }
              System.out.println();
            }
            
*****
*   *
*   *
*****
            */




            //right traingle

            /*for(int i =1;i<=4;i++)
            {
                for(int j=1 ; j<=i ;j++)
                {
                    System.out.print("*");
                }
                System.out.println();    
*
**
***
****
            }*/


            //upright traingle

            for(int i =5;i>=1;i--)
            {
                for(int j=1 ; j<=i ;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            // ****
            // ***
            // **
            // *
                 

                 /*for(int i =1 ;i<=4;i++)
                 {
                     for(int j=1;j<=n-i;j++)
                     {
                         System.out.print(" ");

                     }
                     for(int j=1 ;j<=i;j++)
                         {
                             System.out.print("*");
                         }
                     System.out.println();

                        }

   *
  **
 ***
****
                        */



     /*for(int i =1; i<=4 ; i++)
     {
         for(int j =1; j<=i ;j++)
         {
             System.out.print(j);
         }
         System.out.println();
     }


1
12
123
1234

    }*/
   

   /* for(int i =1;i<=5;i++)
    {
        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print(j+" ");
        }
        
        System.out.println();



        
    }


    or 

    or 


        for(int i =5;i>=1;i--)
            {
                for(int j=1 ; j<=i ;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

*/

// for(int i=1;i<=5;i++)
// {
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print(j+" ");
//     }
//     System.out.println();
    
// }


// for(int i=1;i<=10;i++)
// {
//     for(int j=1;j<=10;j++)
//     {
//         System.out.print("-");
//     }
//     System.out.println();
// }

}



}
