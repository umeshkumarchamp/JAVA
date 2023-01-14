import java.util.Random;
public class array {
    public static void main(String[] args){

        Random ran = new Random(); 
        int ind = ran.nextInt(5); 

        String names[] = {"umesh", "champ","ramesh" ,"dinesh","amit"}; 
        System.out.println(names[ind]); 

        // to print whole loop 
        for(int i=0; i<names.length; i++)
        {
            System.out.print(names[i]+" "); 
        }
        //AF0258298
        System.out.println(); 



        String name[] = {"umesh", "champ","ramesh" ,"dinesh","amit","mahesh","atul","krish","manish","roshan"}; 

        int index = ran.nextInt(9); 
        System.out.println(name[index]); 

        // Create table from 1 to 10..
        for(int i=1; i<=10; i++)
        {
            mul(i); 
        }

        int a[] = {3,5,6,7,2}; 
        int arr[] = new int[a.length]; 
        for(int i=0; i<a.length; i++){
            int s = squ(a[i]);  
            System.out.println("Square of "+a[i]+" is "+s); 
            arr[i] = s; 
            if(i == a.length-1)
            {
                System.out.print("My previous array elements is :- "); 
                for(int j=0; j<a.length; j++)
                {
                    System.out.print(a[j]+" "); 
                }
                System.out.println(); 
                System.out.print("My new array elements is :- "); 
                for(int k=0; k<a.length; k++)
                {
                    System.out.print(arr[k]+" "); 
                }
            }
        }
        
        
        




    }
    static int squ(int num)
    {
        return num*num; 
    }


    static void mul(int num)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i); 
        }
        System.out.println(); 
    }



}




