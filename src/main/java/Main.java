import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Scope scope = (Scope)ctx.getBean("scopeTest");
        Scope scopeDuplicate = (Scope)ctx.getBean("scopeTestDuplicate");
        System.out.println(scope == scopeDuplicate);
        System.out.println(scope + "::" + scopeDuplicate);

        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("beans.xml");
        Scope scope1 = (Scope)ctx1.getBean("scopeTest");

        System.out.println(scope == scope1);

    }


}
