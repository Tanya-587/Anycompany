package anycompany.service;

import anycompany.entity.Customer;
import anycompany.entity.Order;
import anycompany.repository.CustomerRepository;
import anycompany.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
    public class OrderService {

        private final OrderRepository orderRepository;
        private final CustomerRepository customerRepository;

        public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository) {
            this.orderRepository = orderRepository;
            this.customerRepository = customerRepository;
        }

        public boolean placeOrder(Order order, int customerId) {
            Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
            if (((Optional<?>) optionalCustomer).isPresent()) {
                Customer customer = optionalCustomer.get();
                if (order.getAmount() == 0)
                    return false;

                if (customer.getCountry().equals("UK"))
                    order.setVAT(0.2d);
                else
                    order.setVAT(0);

                orderRepository.save(order);

                return true;
            }
            return false;
        }
    }

