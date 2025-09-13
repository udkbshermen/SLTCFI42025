package tasksheets;

public class tasksheet113 {
    public static void main(String[] args) {

        int check_number = 10; //initialize length

        //used check_number for loop
        for(int i=1; i<=check_number;i++){
            //initialize message and input given ternary operation
            String message = (i%2==0)? + i + " is even number." : i + " is odd number.";
            //print message
            System.out.println(message);
        }

    }
}
