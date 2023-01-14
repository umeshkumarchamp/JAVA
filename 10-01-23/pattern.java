public class pattern {
    public static void main(String[] args){

        // Pattern 2 (square)
        for(int r=1; r<=5; r++)
        {
            for(int c=1; c<=5; c++)
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        
        // Pattern 2 
        for(int r=1; r<=5; r++)
        {
            for(int c=1; c<=r; c++)
            {
                System.out.print(c); 
            }
            System.out.println(); 
        }

        // Pattern 3 
        int n=1;
        for(int r=1; r<=4; r++)
        {
            for(int c=1; c<=r; c++)
            {
                 
                System.out.print(n+" "); 
                n++; 

            }
            System.out.println(); 
        }
        
        // Pattern 4
        System.out.println();  
        for(int r=1; r<=5; r++)
        {
            for(int c=5; c>=r; c--)
            {
                int a = c; 
                System.out.print(a); 
                a--; 
                 
            }
            System.out.println(); 
        }



    }
}
