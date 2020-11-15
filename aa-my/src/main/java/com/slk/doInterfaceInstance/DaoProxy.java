package com.slk.doInterfaceInstance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoProxy {
	public static Object getProxy(Class clazz){
		return Proxy.newProxyInstance(DaoBeanFactory.class.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(clazz.getSimpleName()+"代理对象打印:"+args[0].toString());
				return null;
			}
		});
	}
}
