import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        // Get same
        Scope scope1 = (Scope)ctx.getBean("scopeTest");
        Scope scope2 = (Scope)ctx.getBean("scopeTest");

        System.out.println(scope1 == scope2);

        Scope scopeDuplicate1 = (Scope)ctx.getBean("scopeTestDuplicate");

        System.out.println(scope1 == scopeDuplicate1);

        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("beans.xml");

        Scope scope3 = (Scope)ctx1.getBean("scopeTest");
        Scope scopeDuplicate2 = (Scope)ctx1.getBean("scopeTestDuplicate");

        System.out.println(scope1 == scope3);

        System.out.println(scopeDuplicate1 == scopeDuplicate2);

    }


}
