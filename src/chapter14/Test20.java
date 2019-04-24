package chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入：");
		String str = sc.nextLine();
		try {
			Class<?> cc = Class.forName(str);
			Method[] m = cc.getMethods();
			Constructor[] ct = cc.getConstructors();
			for(Method method : m) {
				System.out.println(method);
			}
			System.out.println("--------------------");
			for(Constructor constructor : ct) {
				System.out.println(constructor);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
