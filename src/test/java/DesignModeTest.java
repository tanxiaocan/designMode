import com.txc.strategyMode.factory.CashContext;
import org.junit.Test;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
public class DesignModeTest {
    @Test
    public void test(){
        CashContext cashContext = new CashContext("CashRebate",0.8);
        System.out.println(cashContext.getResult(1000));
    }
}
