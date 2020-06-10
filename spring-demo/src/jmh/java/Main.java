import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hwz
 * @date 2020/6/9 7:03 下午
 */
public class Main {

	public static void main(String[] args) {
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("Beans.xml");
//		Person obj = (Person) context.getBean("person");
//		System.out.println(obj.getName());

		ApplicationContext ac = new AnnotationConfigApplicationContext(Person.class);
		System.out.println(123);
		System.out.println(ac);
	}
}
