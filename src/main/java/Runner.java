import validators.PLIDvalidator;

public class Runner {
    public static void main(String[] args) {
        PLIDvalidator pliDvalidator =new PLIDvalidator();
       boolean sdsd =  pliDvalidator.validate("ABA3000-00");
        System.out.println(sdsd);
    }
}
