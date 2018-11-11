package cglib.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {

	public static UserServiceImpl createService() {
		//1、目标类
		final UserServiceImpl us = new UserServiceImpl();
		//2、切面类
		final MyAspect myaspect = new MyAspect();
		
		//3、代理类,采用cglib，底层创建目标类的子类

		//3.1 核心类
		Enhancer enhancer = new Enhancer();
		//3.2确定父类
		enhancer.setSuperclass(us.getClass());
		
		/*
		 * 3.3设置回调函数 MethodInterceptor 接口等效 jdk InvocationHandler
		 * intercept() 等效jdk动态代理中 invoke()方法
		 */
		enhancer.setCallback(new MethodInterceptor() {
			
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				
				//执行目标方法前执行的方法
				myaspect.before();
				
				//执行目标类的方法
				Object obj = method.invoke(us, args);
				// * 执行代理类的父类，执行目标类（目标类和代理类 是 父子关系）
				methodProxy.invokeSuper(proxy, args);
				//执行目标方法后执行的方法
				myaspect.after();
				return obj;
			}
		});
		//3.4创建代理
		UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
		
		return proxyService;
	}
	
}
