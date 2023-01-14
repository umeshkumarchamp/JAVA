public class question {
    public static void main(String[] args){

        /*
          Q1. WAP to calculate average of array elements ?
         */

        int arr[] = {1,3,6,9,11}; 
        int sum=0; 
        int len = arr.length; 
        for(int i=0; i<len; i++)
        {
            sum = arr[i] + sum;  
        }
        System.out.println("Sum of elements is - "+sum); 
        int avg = sum/len; 
        System.out.println("The average of my array is - "+avg); 

        System.out.println("--------------------------------"); 
        /*
          Q2. WAP to copy all the values one array into another array?
           
         */
        int org[] = {24,5,3,2,4}; 
        int cpy[] = new int[org.length]; 

        for(int i=0; i<org.length; i++)
        {
            cpy[i] = org[i]; 
        }

        System.out.print("My original array is - "); 
        for(int i=0; i<org.length; i++)
        {
            System.out.print(org[i]+" "); 
        }

        System.out.println(); 
        System.out.print("My Copy array is - "); 
        for(int i=0; i<cpy.length; i++)
        {
            System.out.print(cpy[i]+" "); 
        }

        System.out.println("\n--------------------------------"); 
        /*
          Q3. WAP to print an array value in reverse order
         */

         int rev[] = {1,2,3,4,5}; 
         System.out.print("My reverse array is :- ");
         for(int i = rev.length-1; i>=0; i--)
         {
            System.out.print(rev[i]+":"); 
         }

         System.out.println("\n--------------------------------"); 

         /*
            WAP to fing a value in array if value is present 
            then print position of value
          */

          int pos[] = {22,34,16,87,58,35,31}; 
          int f = 37; 
          int i; 
          for(i=0; i<pos.length; i++)
          {
            if(pos[i] == f)
            {
                System.out.print("The Value '"+f+"' is found at "+i+"th position."); 
                break; 
            }
          }
          if(i == pos.length){
            System.out.println("This value '"+f+"' is not present in this array."); 
          }


          System.out.println("\n--------------------------------"); 




    }
}
