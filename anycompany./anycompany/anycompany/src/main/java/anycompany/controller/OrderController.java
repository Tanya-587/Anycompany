package anycompany.controller;

import anycompany.entity.Order;
import anycompany.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



    @RestController
    @RequestMapping("/api/order")
    public class OrderController {

        private final OrderService orderService;

        public OrderController(OrderService orderService) {
            this.orderService = orderService;
        }

        @PostMapping("/{customerId}")
        public ResponseEntity<String> placeOrder(@RequestBody Order order, @PathVariable int customerId) {
            boolean isOrderPlaced = orderService.placeOrder(order, customerId);
            if (isOrderPlaced)
                return ResponseEntity.ok("Order placed successfully");
            else
                return ResponseEntity.badRequest().body("Failed to place order");
        }

        // Other CRUD operations for orders

    }


