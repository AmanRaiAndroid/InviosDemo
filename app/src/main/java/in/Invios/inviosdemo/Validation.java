package in.Invios.inviosdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean isEmailValid(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password)
    {
        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN="((?=.*\\d)(?=.*[a-z])|(?=.*\\d)(?=.*[A-Z])).{6,25}";

        pattern = Pattern.compile(PASSWORD_PATTERN);

        /**
         * Validate password with regular expression
         * @param password password for validation
         * @return true valid password, false invalid password
         */
        matcher = pattern.matcher(password);
        return matcher.matches();

    }
}
