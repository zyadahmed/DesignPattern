import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws IllegalAccessException {

        try {
            if (method.getName().startsWith("get")){
                return method.invoke(person,objects);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw  new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person,objects);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
