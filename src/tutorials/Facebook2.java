package tutorials;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Facebook2 implements Company {
	 
		private String order = " Facebook with Order-2";
	 
		public String toString() {
			return "Class Name: " + this.getClass().getSimpleName() + " - Result: " + this.order;
		}
	
}
