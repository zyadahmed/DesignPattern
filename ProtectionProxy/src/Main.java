import java.lang.reflect.Proxy;


public class Main {
    private static PersonBean getOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean)
        );
    }
    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl();
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println(ownerProxy.getName());
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
                    System.out.println("Can’t set rating from owner proxy");
        }


    }
}
