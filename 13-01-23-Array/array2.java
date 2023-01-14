import java.util.*; 
public class array2 {
    public static void main(String[] args){
        System.out.println("J A V A   A R R A Y "); 

        // METHOD 1 
        int arr[]; 
        arr = new int[5]; 
        
        /*
            index  - 0 1 2 3 4       
            element- 3 5 7 9 1
         */
        System.out.println("Length of my array is - "+arr.length); 
        arr[0] = 3; 
        arr[1] = 5; 
        arr[2] = 7; 
        arr[3] = 9; 
        arr[4] = 1; 
        System.out.print("My Array elements By method 1 - "); 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" "); 
        }
        
        // METHOD 2 
        System.out.println(); 
        int myArr[] = {2,4,6,8}; 
        System.out.print("My Array elements By mehtod 2 :- "); 
        for(int i=0; i<myArr.length; i++)
        {
            System.out.print(myArr[i]+" "); 
        }
        System.out.println(); 
        int twoArr[][] = new int[6][6]; 
        System.out.println("The Size of 2 D array - "+twoArr.length);
        twoArr[0][0] = 23; 
        System.out.println(twoArr[0][0]);
        for(int r=0; r<twoArr.length; r++)
        {
            for(int c=0; c<twoArr.length; c++)
            {

            }
        }
        



    }

}
