package APP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by kalisiaczki on 21.01.2017.
 */


public class App {

    public static void main(String[] args) {

      ApplicationContext context = new FileSystemXmlApplicationContext("config.xml");
        Cantor cantor = (Cantor) context.getBean("can");
        cantor.draw();

    }



}
