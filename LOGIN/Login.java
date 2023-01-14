import java.util.*; 

public class Login {
    public static void  main(String[] args){
        System.out.println("\nW E L C O M E   T O   M Y   W O R L D\n"); 
        
        // Calling login function.
        login(); 

    }

    // User Login 
    static void login()
    {
        Scanner s =  new Scanner(System.in);
        
        // username & password
        String username = "umesh"; 
        String password = "umesh@123"; 

        System.out.print("Enter Your Username : "); 
        String uname = s.nextLine();
        System.out.print("Enter Your Password : ");
        String pass = s.nextLine(); 


        
        // Validation username and password.............
        if(!uname.equals(username)){
            System.out.println("Invalid Username ! "); 
        }
        else if(!pass.equals(password)){
            System.out.println("Wrong Password !"); 
            //String yes = "yes"; 
            System.out.println("Do You Want Try Again ? ' yes or no '"); 
            String yes = s.nextLine(); 
            switch(yes){
                case "yes":
                    login(); 
                    break; 
                default:
                    System.out.println("Thanks for Visiting."); 
                    break; 
            }
        }
        else{

            System.out.println("\n******** Welcome to the world of Coding ********"); 

            if(uname.equals(username) && pass.equals(password))
            {
                umesh_details();
            }


        }


    }

    // Displaying User's Details ............................
    static void display(String name , String fname, String mname, long phone)
    {
        System.out.println("\nYour Name : "+name); 
        System.out.println("Father Name : "+fname); 
        System.out.println("Mother Name : "+mname); 
        System.out.println("Phone Number : "+phone);

        update(name, fname, mname, phone);  
        
    }

    // Updating User's Details ..............................
    static void update(String name, String fname, String mname, long phone){
        System.out.println("\nDo you want to update anything ? 'yes or no' "); 
        Scanner s =  new Scanner(System.in);
        String yes = s.nextLine(); 
        
        switch(yes){
            case "yes":
                System.out.println("\nWhat you want to update?");
                System.out.println("Press 'n' for your_name "); 
                System.out.println("Press 'f' for father_name "); 
                System.out.println("Press 'm' for mother_name "); 
                System.out.println("Press 'p' for phone_number "); 
                String up = s.nextLine(); 
                switch(up)
                {
                    case "n":
                        System.out.print("\nEnter you name : "); 
                        String new_name = s.nextLine(); 
                        name = new_name;
                        System.out.println("\nYour Details Updated Successfully :- "); 
                        display(name, fname, mname, phone);
                        break; 
                    case "f":
                        System.out.print("Enter your father name : "); 
                        String new_fname = s.nextLine(); 
                        fname = new_fname; 
                        System.out.println("\nYour Details Updated Successfully :- "); 
                        display(name, fname, mname, phone);
                        break; 
                    case "m":
                        System.out.print("Enter you mother name : "); 
                        String new_mname = s.nextLine(); 
                        mname = new_mname; 
                        System.out.println("\nYour Details Updated Successfully :- "); 
                        display(name, fname, mname, phone);
                        break; 
                    case "p":
                        System.out.print("Enter your phone number : "); 
                        long new_phone = s.nextLong(); 
                        phone = new_phone; 
                        System.out.println("\nYour Details Updated Successfully :- "); 
                        display(name, fname, mname, phone);
                        break; 
                    default: 
                        System.out.println();
                        break; 
                }
                break;
            default: 
                System.out.println("\nOK ! Thanks for Visiting.");

        }
        
    }

    // Details of User...............
    static void umesh_details(){
        String name =  "Umesh Kumar Champ";
        String fname = "Shatrughan Mahto"; 
        String mname = "Saraswati Devi"; 
        long phone = 6201033951L; 
        System.out.println("\nYour Details According to our Database :- "); 
        display(name, fname, mname, phone); 
        System.out.println("\n******** Umesh Kumar Champ *********\n");
    }




}
