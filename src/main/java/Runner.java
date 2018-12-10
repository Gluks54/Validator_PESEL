import validators.PLIDvalidator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        PLIDvalidator pliDvalidator =new PLIDvalidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your ID number");
        String idNumb = scanner.nextLine();
        boolean idReaz =  pliDvalidator.validate(idNumb);
        System.out.println(idReaz);
    }
}
