package com.myproxy.custom;



import com.myproxy.model.Person;

import java.lang.reflect.Method;


public class MyInvocationHandlerImpl implements MyInvocationHandler {
	//��ʱд��
	private Person target;
	
	//��ȡ�������ʵ��
	public Object getInstance(Person target) throws Exception{
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("����������class��:"+clazz);
		return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("�����ʲô��");
		System.out.println("��ʼ���е��...");
		System.out.println("------------");
		method.invoke(this.target, args);
		System.out.println("------------");
		System.out.println("�õģ����µ������Ժ󡣡�������");
		return null;
	}

}
