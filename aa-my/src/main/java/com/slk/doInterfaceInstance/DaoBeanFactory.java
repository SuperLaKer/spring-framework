package com.slk.doInterfaceInstance;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 始终返回class的代理对象
 * new DaoBeanFactory()需要提供一个clazz，how to ? 在bd中设置了参数
 */
public class DaoBeanFactory implements FactoryBean {

	private Class clazz;

	public DaoBeanFactory(Class clazz, String s) {
		/*参见：*/
		System.out.printf("DaoFactoryBean构造方法，参数1: %s, 参数二：%s%n", clazz.getName(), s);
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		return DaoProxy.getProxy(clazz);
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
