package bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hwz
 * @date 2020/6/10 4:04 下午
 */
public class TestPostProcessor {
	public static void main(String[] args) {
		System.out.println("容器启动成功");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		//打印当前容器所有beanDefinition
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		System.out.println("---------");

		Calculator calculator = applicationContext.getBean(Calculator.class);
		calculator.add(1,2);
	}
}
