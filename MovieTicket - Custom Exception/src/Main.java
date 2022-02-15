import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter card number: ");
        String cardNo = sc.nextLine();
        BookTicket bt = new BookTicket();

        try{
            bt.checkAge(age,"R");
            bt.addCard(cardNo);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }


    }
}
