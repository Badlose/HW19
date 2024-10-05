import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

    private static boolean checkPattern(String str) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9_]{1,20}");
        Matcher matcher = pattern.matcher(str);
        return !matcher.matches();
    }

    private static boolean confirmPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (checkPattern(login)) {
            throw new WrongLoginException();
        }

        if (checkPattern(password)) {
            throw new WrongPasswordException();
        }
        if (checkPattern(confirmPassword)) {
            throw new WrongPasswordException();
        }

        if (!confirmPassword(password, confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
