package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hwz
 * @date 2020/6/10 3:56 下午
 */
@Component
public class MyAspectJAutoProxyCreator implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		final Object obj = bean;

		if (bean instanceof Calculator) {
			Object proxyObj = Proxy.newProxyInstance(this.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.println("方法执行前");
					Object result = method.invoke(obj, args);
					System.out.println("方法执行后");
					return result;
				}
			});
			return proxyObj;
		}

		return obj;
	}
}
