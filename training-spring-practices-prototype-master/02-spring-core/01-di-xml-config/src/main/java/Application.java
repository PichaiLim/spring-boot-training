import com.training.spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld =  context.getBean(HelloWorld.class);
        System.out.println("args = [" + helloWorld.message + "]");
    }

}
