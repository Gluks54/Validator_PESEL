import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;
import validators.Pesel_validate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class PESEL_Test {

    Pesel_validate pesel_validate;
    @Before
    public void setUp(){
        pesel_validate = new Pesel_validate();
    }

    @Test
    @Parameters(method = "corPesData")
    public void testCorPesData(String number){
        assertTrue(pesel_validate.validate(number));
    }
    private Object [][] corPesData (){
        return new Object[][]{
                {"50013190875"},
                {"92121296575"},
                {"00130090766"},
                {"54150190876"},
                {"54090190876"}};
    }

    @Test
    @Parameters(method = "unCorPesData")
        public void testUnCorData(String number){
        assertFalse(pesel_validate.validate(number));
    }
    private Object[][] unCorPesData(){
        return new Object[][]{
                {"00234490876"},
                {"001gsck0766"},
                {"0013-090766"}
        };
    }
}
