package cn.openlab.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class MyProxy {
	
	public void execute() {
		InvocationHandler ih = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				
				return null;
			}
			
		};
		Target t = (Target)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Target.class}, ih);
		//...
		t.execute();
		//...
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		MyProxy mp = new MyProxy();
		mp.execute();
	}
}
