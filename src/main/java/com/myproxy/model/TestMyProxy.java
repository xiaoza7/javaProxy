package com.myproxy.model;

import com.myproxy.custom.MyInvocationHandlerImpl;

public class TestMyProxy {
	public static void main(String[] args) {
		
		try {
			

			//ԭ��
			//1.�õ��������������ã�Ȼ���ȡ���Ľӿ�
			//2.JDK������������һ���࣬ͬʱʵ�����Ǹ��Ĵ��������ʵ�ֵĽӿ�
			//3.�ѱ�������������Ҳ�õ���
			//4.���¶�̬����һ��class�ֽ���
			//5.Ȼ�����
			
			//��ȡ�ֽ�������


			
			Person obj = (Person)new MyInvocationHandlerImpl().getInstance(new Child());
			System.out.println(obj.getClass());
			obj.eat();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
