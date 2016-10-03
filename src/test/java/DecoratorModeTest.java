import com.txc.decoratorMode.*;
import org.junit.Test;

/**
 * Created by tanxiaocan on 2016/10/2.
 */
public class DecoratorModeTest {
    @Test
    public void test(){
        Person person = new Person("谭晓灿");
        Decorator decorator1 = new DecoratorImpl1(person);
        Decorator decorator2 = new DecoratorImpl2(decorator1);
        Decorator decorator3 = new DecoratorImpl3(decorator2);
        decorator3.show();
    }
}
