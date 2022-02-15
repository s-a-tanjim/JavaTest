import movieexception.CardNotWorkingException;
public class BookTicket extends Eligibility{
    public void addCard(String cardNo) throws CardNotWorkingException{
        if(cardNo.length()<16){
            throw new CardNotWorkingException("Invalid Card");
        } else {
            System.out.println("Card is valid.");
        }
    }
}
