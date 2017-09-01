package tutorials;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Yahoo3 implements Company {
	 
		private String order = " Yahoo with Order-3";
	 
		public String toString() {
			return "Class Name: " + this.getClass().getSimpleName() + " - Result: " + this.order;
		}
	
	
}
