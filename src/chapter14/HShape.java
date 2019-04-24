package chapter14;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class HShape {
	boolean highlighted = false;

	public void highlight() {
		highlighted = true;
	}

	public void clearHighlight() {
		highlighted = false;
	}

	void draw() {
		System.out.println(this + " draw()");
	}

	public String toString() {
		return getClass().getName() + (highlighted ? " highlighted" : " normal");
	}

	static List<HShape> shapes = new ArrayList<HShape>();

	public HShape() {
		shapes.add(this);
	}

	static void highlight1(Class<?> type) {
		for (HShape shape : shapes) {
			if (type.isInstance(shape)) {
				shape.highlight();
			}
		}
	}

	static void clearHighlight1(Class<?> type) {
		for (HShape shape : shapes) {
			if (type.isInstance(shape)) {
				shape.clearHighlight();
			}
		}
	}

	static void forEach(Class<?> type, String method) {
		try {
			Method m = HShape.class.getMethod(method, (Class<?>[]) null);
			for (HShape shape : shapes) {
				if (type.isInstance(shape)) {
					m.invoke(shape, (Object[]) null);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	static void highlight2(Class<?> type) {
		forEach(type, "highlight");
	}

	static void clearHighlight2(Class<?> type) {
		forEach(type, "clearHighlight");
	}
}
