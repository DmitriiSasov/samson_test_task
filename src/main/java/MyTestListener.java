import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        var res = context.getAllTestMethods();
        if (res.length == 0) {
            return;
        }
        var methodOrConstr = res[0].getConstructorOrMethod();
        if (methodOrConstr == null){
            return;
        }
        var method = methodOrConstr.getMethod();
        if (method == null) {
            return;
        }
        var annotation = method.getDeclaredAnnotation(TestMethodInfo.class);
        if (annotation == null) {
            return;
        }
        System.out.println(annotation.priority().name() + "    " + annotation.author() + "    " + annotation.lastModified());
    }
}
