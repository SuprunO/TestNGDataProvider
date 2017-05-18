import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alex on 18.05.2017.
 */
public class UnitTest {

    private Calculator calc = new Calculator();

    @DataProvider
    public Object[][] summLocalData() {
        return new Object[][]{
                {5, calc.summ(2, 3)},
                {0, calc.summ(0, 0)},
                {0, calc.summ(-2, 2)},
                {-100, calc.summ(-30, -70)},
                {10000, calc.summ(3000, 7000)},
        };
    }

    @Test(dataProvider = "summLocalData")
    public void sum(int rezult, int sumDigit) {
        assertEquals(rezult, sumDigit);
    }
}

