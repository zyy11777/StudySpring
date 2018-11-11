package jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {

	public static UserService createService() {
		//1、目标类
		final UserService us = new UserServiceImpl();
		//2、切面类
		final MyAspect myaspect = new MyAspect();
		/*
		 * 3、代理类：将目标类（切入点）和切面类 （通知） 结合   形成切面
		 * Proxy.newProxyInstance
		 * 		参数1： loader  类加载器，动态代理类，运行时创建，任何类都需要类加载器将其加载到内存
		 * 				一般情况：当前类.class.getClassLoader()  或
		 * 						  目标类实例.class.getClassLoader()
		 * 		参数2：Class[] interfaces 代理类需要实现的所有接口
		 * 				方式1：目标类实例.getClass.getInterfaces()   注意：只能获得自己的接口，不能获得父元素的接口
		 * 				方式2：new Class[]{目标类.class}
		 * 		参数3：InvocationHandler 处理类，接口，必须进行实现类，一般采用匿名内部类
		 * 				提供了一个invoke方法，代理类的每一个方法执行时，都将调用一次invoke
		 * 					参数31：Object proxy ：代理对象
		 * 					参数32：Method method ： 代理对象当前执行的方法的描述对象（反射）
		 * 							执行方法名：method.getName()
		 * 							执行方法：method.invoke(对象，实际参数)
		 * 					参数33：Object[] args: 方法实际参数
		 * 		
		 */
		UserService proxyservice = (UserService) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				us.getClass().getInterfaces(), 
				new InvocationHandler() {
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 目标类方法前执行
						myaspect.before();
						// 执行目标类的方法
						Object obj = method.invoke(us, args);
						// 目标类方法后执行
						myaspect.after();
						
						return obj;
					}
				});
		return proxyservice;
	}
	
}
