import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by emperor on 2017/3/11.
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.zonshi")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
