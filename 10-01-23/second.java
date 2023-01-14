public class second {
    public static void  main(String[] args)
    {
        boolean isDamaged = true;
        if(isDamaged){
            System.out.println("The Car is damaged."); 
        }

        String username = "umesh"; 
        String password = "12345"; 

        System.out.println("********************************"); 

        // if else statement.............

        if(username.equals("umesh") && password.equals("12345")){
            System.out.println("You are a valid user."); 
        }
        else{
            System.out.println(" Sorry , Invalid user.");
        }

        System.out.println("********************************"); 
        // else if statement..........
        
        if(!username.equals("umesh")){
            System.out.println("Incorrect Username."); 
        }
        else if(!password.equals("1235")){
            System.out.println("Incorrect Password.");
        }
        else{
            System.out.println("Congratulations! You are logged in."); 
        }


        System.out.println("********************************"); 

        int money = 30; 

        if(money==400){
            System.out.println("You can go for a movie."); 
        }
        else if(money>=100 && money<=400)
        {
            System.out.println("You can go for momo party."); 
        }
        else if(money<=50){
            System.out.println("Bro please phonepe me 50 Rs.");
        }
        else{
            System.out.println("Stay Home Bro"); 
        }

        
        System.out.println("********************************"); 

        // switch case .............

        char grade ='A'; 

        switch(grade){
            case 'A':
                System.out.println("Your score is more than 80%."); 
                break; 
            case 'B':
                System.out.println("Your score is more than 60%."); 
                break; 
            case 'C':
                System.out.println("Your score is more than 40%."); 
                break; 
            default:
                System.out.println("Sorry, You are failed. Please try later."); 
                break; 
        }
        

        
        System.out.println("********************************"); 

        Integer amount = 300; 

        switch(amount){
            case 500:
                System.out.println("You can go for a movie.");
                break; 
            case 400:
                System.out.println("You can go for chicken party.");
                break; 
            case 300: 
                System.out.println("You can go for momo party.");
                break; 
            case 200:
                System.out.println("You have 200 so give me 100 ok."); 
                break; 
            case 100:
                System.out.println("You have 100 only you can't use it, so send it to me ok."); 
                break; 
            default:
                System.out.println("Enjoy Yourself and stay home."); 
        }


        // Looping Statement............. doubt here
        // for loop........
        System.out.println("For Loop......."); 
        for(int i=1; i<=10;i++)
        {
            if(i==5){
                System.out.println(i+" - Umesh"); 
            }
            System.out.println(i+" - Champ"); 
        }

        // while loop...........
        System.out.println("While Loop..........."); 
        int i=0; 
        while(i < 11)
        {
            if(i==5){
                System.out.println(i+" - Umesh"); 
            }
            System.out.println(i+ " - Champ"); 
            i++; 
        }
        // Do While loop...............
        System.out.println("do while loop........"); 

        do{
            System.out.println(i+" - do statement always execute at once."); 
            i++; 
        }while(i<15); 





    }
}
