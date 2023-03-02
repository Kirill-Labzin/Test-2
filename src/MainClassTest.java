import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass Main = new MainClass();
    @Test
    public void testGetClassNumber(){
        int a = Main.getClassNumber();
        
        Assert.assertTrue("variable 'a' less 45",a > 45);
    }
}
