package com.myproxy.custom;



import com.myproxy.model.Person;

import java.lang.reflect.Method;


public class MyInvocationHandlerImpl implements MyInvocationHandler {
	//暂时写死
	private Person target;
	
	//获取被代理的实例
	public Object getInstance(Person target) throws Exception{
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("被代理对象的class是:"+clazz);
		return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("你想吃什么？");
		System.out.println("开始进行点餐...");
		System.out.println("------------");
		method.invoke(this.target, args);
		System.out.println("------------");
		System.out.println("好的，已下单，请稍后。。。。。");
		return null;
	}

}
