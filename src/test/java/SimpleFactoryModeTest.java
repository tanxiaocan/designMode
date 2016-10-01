import org.junit.Assert;
import org.junit.Test;
import com.txc.simpleFactoryMode.service.Calculator;
import com.txc.simpleFactoryMode.factory.CalculatorFactory;

/**
 * Created by tanxiaocan on 2016/9/30.
 */
public class SimpleFactoryModeTest {
    @Test
    public void testAdd(){
        Calculator calculator = CalculatorFactory.getCalculatorInstance(CalculatorFactory.CalculatorType.ADD);
        double result = calculator.doCount(22,33);
        Assert.assertTrue(result == 55);
    }
}
