package spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类中确定通知，需要实现不同接口，接口就是规范，从而就确定了方法名称
 * 采用 “环绕通知” MethodInterceptor
 * 
 * @author zhangyy
 *
 */
public class MyAspect implements MethodInterceptor{

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("前方法");
		
		
		// 手动执行目标方法
		Object obj = mi.proceed();
		
		System.out.println("后方法");

		return obj;
	}

}
