import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TetsCaculator {
    @Test
    public void testSum(){
        Caculator cals = new Caculator();
        Assert.assertEquals(cals.sum(3,4),7);
    }

    @Test
    public void testSub(){
        Caculator cals = new Caculator();
        Assert.assertEquals(cals.sub(2,2),0);
    }
}
