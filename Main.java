package Email_Validation;


public class Main {
    public static void main(String[] args) {
        String email1 = "sumeet@example.com";
        String email2 = "alice&example.com";

        boolean flag1 = Validation.email_validation(email1);
        System.out.println("The Email address : " + email1 + " is " + (flag1 ? "valid" : "invalid"));
        boolean flag2 = Validation.email_validation(email2);
        System.out.println("The Email address : " + email2 + " is " + (flag2 ? "valid" : "invalid"));

        String phone1 = "9938934490";
        String phone2 = "99-89-4490";
        boolean flag3 = Validation.phone_validation(phone1);
        System.out.println("The Phone Number : " + phone1 + " is " + (flag3 ? "valid" : "invalid"));
        boolean flag4 = Validation.phone_validation(phone2);
        System.out.println("The Phone Number : " + phone2 + " is " + (flag4 ? "valid" : "invalid"));

    }
}
