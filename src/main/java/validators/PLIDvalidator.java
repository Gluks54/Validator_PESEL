package validators;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PLIDvalidator implements Validator {
    final int firstWag = 7;
    final int secoWag = 3;
    final int thierdWag = 1;

    @Override
    public boolean validate(String number) {
        Pattern pattern = Pattern.compile("^[A-Za-z]{3}\\d{6}$");
        Matcher matcher = pattern.matcher(number);
        if(matcher.find()){
                       Map<Character,Integer> letterMap = new HashMap<>();
            letterMap.put('A',10);
            letterMap.put('B',11);
            letterMap.put('C',12);
            letterMap.put('D',13);
            letterMap.put('E',14);
            letterMap.put('F',15);
            letterMap.put('G',16);
            letterMap.put('H',17);
            letterMap.put('I',18);
            letterMap.put('J',19);
            letterMap.put('K',20);
            letterMap.put('L',21);
            letterMap.put('M',22);
            letterMap.put('N',23);
            letterMap.put('O',24);
            letterMap.put('P',25);
            letterMap.put('Q',26);
            letterMap.put('R',27);
            letterMap.put('S',28);
            letterMap.put('T',29);
            letterMap.put('U',30);
            letterMap.put('V',31);
            letterMap.put('W',32);
            letterMap.put('X',33);
            letterMap.put('Y',34);
            letterMap.put('Z',35);


            char [] firstLetters = number.toCharArray();
            int numOfFiLet = letterMap.get(firstLetters[0]);
            int numOfSecod = letterMap.get(firstLetters[1]);
            int numOfthird = letterMap.get(firstLetters[2]);

            int[] arrayAnnet = new int[] {7,3,1,9,7,3,1,7,3};
            int[] arrayAnnetFinal =new int[]{numOfFiLet,
                    numOfSecod,numOfthird,
                    Integer.valueOf(firstLetters[3]),
                    Integer.valueOf(firstLetters[4]),
                    Integer.valueOf(firstLetters[5]),
                    Integer.valueOf(firstLetters[6]),
                    Integer.valueOf(firstLetters[7]),
                    Integer.valueOf(firstLetters[8]),
            };



            return true;
        }
        return false;
    }
}
