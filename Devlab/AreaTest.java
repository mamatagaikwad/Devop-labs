import java.beans.Transient;
import org.junit.*;
public class AreaTest {
    @Test 
    public void test1forarea(){
        Area obj = new Area();
        Assert.assertEquals(40, obj.areaoftriangle(10,8));
    }
}
