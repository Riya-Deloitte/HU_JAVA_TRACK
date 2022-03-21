import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password.");
        String password = sc.next();


        try {
            validatePassword(password);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validatePassword(String password) throws PasswordException {
        if (password.length() < 10) {
            throw new PasswordException("Password length is less than 10");
        }

        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        boolean special_character=false;
        for (char c : password.toCharArray()) {
            int ch = (int) c;
            if (Character.isUpperCase(c))
            {
                upperCheck = true;
            }

            if (Character.isLowerCase(c))
            {
                lowerCheck = true;
            }
            if (Character.isDigit(c)) 
            {
                digitCheck = true;
            }
            if(ch>=33&&ch<=38){
                special_character=true;
            }
        }

        if (!upperCheck) {
            throw new PasswordException("There must be an uppercase character");
        }

        if (!lowerCheck) {
            throw new PasswordException ("There must be a lowercase character");
        }

        if (!digitCheck) {
            throw new PasswordException ("There must a be a digit");
        }
        if(!special_character){
            throw new PasswordException("there must be a special character");
        }

        System.out.println("Valid password.");
    }

    static class PasswordException extends Exception {

        public PasswordException() {
            super("Invalid password");
        }

        public PasswordException(String message) {
            super("Invalid password: " + message);
        }
    }

}



