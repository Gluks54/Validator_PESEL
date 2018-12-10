package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel_validate implements Validator<String> {
    @Override
    public boolean validate(String number) {

        Pattern pattern = Pattern.compile("^\\d{2}[0|1]\\d[0-3][0-9]\\d{5}$");
        Matcher matcher = pattern.matcher(number);
        if(matcher.find()) {
            int[] consArr = new int [] {9,7,3,1,9,7,3,1,9,7};
            char [] pesNamArr = number.toCharArray();

            int temp = 0;
            for(int i = 0;i < consArr.length ;i++){
                int temOfConArr = consArr[i];
                int temOfNamArr = Character.getNumericValue(pesNamArr[i]);
                temp +=temOfConArr*temOfNamArr;
            }
            int rezult = temp % 10;
            int endingNumber = Character.getNumericValue(pesNamArr[pesNamArr.length - 1]);
            if(rezult == endingNumber) {
                return true;
            }
        }
        return false;
    }
}
