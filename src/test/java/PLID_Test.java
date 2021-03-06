import com.pl.validator_of_pesel.validators.PLIDvalidator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class PLID_Test {

    PLIDvalidator pliDvalidator;

    @Before
    public void setUp() {
        pliDvalidator = new PLIDvalidator();
    }

    @Test
    @Parameters(method = "corData")
    public void testCorData(String number) {
        assertTrue(pliDvalidator.validate(number));
    }

    private Object[][] corData() {
        return new Object[][]{
                {"ABA300000"},
                {"CAB803709"},
        };
    }

    @Test
    @Parameters(method = "unCorData")
    public void testUncorData(String number) {
        assertFalse(pliDvalidator.validate(number));
    }

    private Object[] unCorData() {
        return new Object[][]{
                {"-BA300-00"},
                {"ABA300200"},
                {"ABA300600"},
                {"ABA300--0"}};
    }
}
