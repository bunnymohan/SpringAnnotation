package tutorials;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // @Order defines the sort order for an annotated component. The value() is optional and represents an order value as
			// defined in the Ordered interface. Lower values have higher priority. The default value is
			// Ordered.LOWEST_PRECEDENCE, indicating lowest priority (losing to any other specified order value).

public class Google1 implements Company {
	 
		private String order = "Google with Order-1";
	 
		public String toString() {
			return "Class Name: " + this.getClass().getSimpleName() + " - Result: " + this.order;
		}
	
	
}
