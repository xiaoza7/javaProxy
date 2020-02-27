package com.myproxy.model;

import com.myproxy.custom.MyInvocationHandlerImpl;

public class TestMyProxy {
	public static void main(String[] args) {
		
		try {
			

			//原理：
			//1.拿到被代理对象的引用，然后获取它的接口
			//2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
			//3.把被代理对象的引用也拿到了
			//4.重新动态生成一个class字节码
			//5.然后编译
			
			//获取字节码内容


			
			Person obj = (Person)new MyInvocationHandlerImpl().getInstance(new Child());
			System.out.println(obj.getClass());
			obj.eat();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
