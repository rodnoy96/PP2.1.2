import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =  (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat beanCat=(Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat.getMessageCat());

        Cat beanCat2=(Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat2.getMessageCat());

        System.out.println("Compare Hello World: " + (bean==bean2));
        System.out.println("Compare Cat: "+ (beanCat==beanCat2));

    }


}