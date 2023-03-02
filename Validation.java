package Email_Validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    public static boolean email_validation(String email) {
        //initialize the Pattern object
        Pattern pattern = Pattern.compile(regex);

        //searching for occurrences of regex
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

     
    static final String str=  "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?";
    public static boolean phone_validation(String phone) {
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
