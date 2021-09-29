import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestListener;

import java.util.ServiceLoader;

import static org.testng.Assert.assertEquals;

public class MethodAnnotationInfoTest {


    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1,1);
    }

}
