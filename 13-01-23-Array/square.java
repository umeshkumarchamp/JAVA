public class square {
    public static void main(String[] args){

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

    static int squ(int num){
        return num*num; 
    }


}
