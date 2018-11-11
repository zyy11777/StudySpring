package cglib.proxy;

/**
 * 切面类
 * @author zhangyy
 *
 */
public class MyAspect {

	public void before() {
		System.out.println("鸡首");
	}
	
	public void after() {
		System.out.println("牛后");
	}
	
}
