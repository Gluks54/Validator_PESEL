import validators.PLIDvalidator;
import validators.Pesel_validate;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        PLIDvalidator pliDvalidator =new PLIDvalidator();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type your ID number");
//        String idNumb = scanner.nextLine();
//        boolean idReaz =  pliDvalidator.validate(idNumb);
//        System.out.println(idReaz);

        Pesel_validate pesel_validate = new Pesel_validate();
        System.out.println( pesel_validate.validate("00130090766"));




    }
}
