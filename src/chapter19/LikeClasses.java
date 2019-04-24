package chapter19;
import static net.mindview.util.Print.*;

public enum LikeClasses {
	WINKEN{
		void behavior() {
			print("Behavior1");
		}
	},
	BLINKEN{
		void behavior() {
			print("Behavior2");
		}
	},
	NOD{
		void behavior() {
			print("Behavior3");
		}
	};
	abstract void behavior();
	
}
