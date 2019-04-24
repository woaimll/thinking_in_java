package chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class NullRobotProxyHandler implements InvocationHandler{
	private String nullName;
	private Robot proxied = new NRobot();
	NullRobotProxyHandler(Class<? extends Robot> type){
		nullName = type.getSimpleName() + " NullRobot";
	}
	private class NRobot implements Robot,Null{

		@Override
		public String name() {
			// TODO Auto-generated method stub
			return nullName;
		}

		@Override
		public String model() {
			// TODO Auto-generated method stub
			return nullName;
		}

		@Override
		public List<Operation> operations() {
			// TODO Auto-generated method stub
			return Collections.emptyList();
		}
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return method.invoke(proxy, args);
	}

}
