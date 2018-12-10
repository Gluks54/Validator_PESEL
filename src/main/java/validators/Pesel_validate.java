package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel_validate implements Validator<String> {
    @Override
    public boolean validate(String number) {

        Pattern pattern = Pattern.compile("^\\d{2}[0|1]\\d[0-3][0-9]\\d{5}$");
        Matcher matcher = pattern.matcher(number);
        if(matcher.find()) {
            return true;
        }
        return false;
    }
}
//[0-9]{2}[0-31]{2}[0-9]{5}
//