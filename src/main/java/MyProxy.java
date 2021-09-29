import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        var annotation = method.getDeclaredAnnotation(Selector.class);
        if (annotation != null) {
            return annotation.xpath();
        }
        return "";
    }
}
