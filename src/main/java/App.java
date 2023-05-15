import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld HW_bean_1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld HW_bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat_bean_1 =
                (Cat) applicationContext.getBean("cat");
        Cat cat_bean_2 =
                (Cat) applicationContext.getBean("cat");

        System.out.println(HW_bean_1 == HW_bean_2);
        System.out.println(cat_bean_1 == cat_bean_2);
    }
}