import movieexception.*;

public class Eligibility {
    public void checkAge(int age,String rate) throws NotApplicableForChildrenException{
        if(age<18 && rate=="R"){
            throw new NotApplicableForChildrenException("Not applicable for people under 18");
        }
        else if(age<15 && rate=="M"){
            throw new NotApplicableForChildrenException("Not applicable for kids under 15");
        }
        else if(age<18 && (rate=="G" || rate=="PG")){
            System.out.println("Applicable for kids");
        }
    }
}
