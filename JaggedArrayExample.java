package Arrays;
public class JaggedArrayExample {

    public static void main(String [] ar)
    {
        int a[][]=new int[4][];
        a[0]=new int[1];
        a[1]=new int[2];
        a[2]=new int[3];
        a[3]=new int[4];

        int count=0;

        for(int i=0;i<a.length;i++)
        
            for(int j=0;j<a[i].length;j++)
            
              a[i][j]=count++;

        System.out.println("Contents of 2D Jagged Array");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++)
                      System.out.print(a[i][j] + " ");
                System.out.println();      
              
              
            }
    
}
}

