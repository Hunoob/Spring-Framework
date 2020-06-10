package bean;

import org.springframework.stereotype.Component;

/**
 * @author hwz
 * @date 2020/6/10 3:55 下午
 */
@Component
public class CalculatorImpl implements Calculator {
	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}
}
