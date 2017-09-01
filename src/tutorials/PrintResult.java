package tutorials;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class PrintResult {
		@Autowired
		private List<Company> order;
		private String result = "";
	 
		public String toString() {
			order.stream().forEach((temp) -> {
				this.result = result + temp + "\n"; // print result and add new line
			});
			return this.result;
		}
	
}
