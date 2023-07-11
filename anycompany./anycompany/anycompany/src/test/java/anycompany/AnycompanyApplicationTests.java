package anycompany;

import anycompany.entity.Order;
import anycompany.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AnycompanyApplicationTests {

		@Autowired
		private OrderService orderService;

		@Test
		void testPlaceOrder() {
			Order order = new Order();
			// Set order properties

			int customerId = 1; // Replace with a valid customer ID

			boolean isOrderPlaced = orderService.placeOrder(order, customerId);

			assertTrue(isOrderPlaced);
		}

		// Add more test methods as needed
	}



