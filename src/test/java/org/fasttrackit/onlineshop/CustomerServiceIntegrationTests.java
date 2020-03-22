package org.fasttrackit.onlineshop;

import org.fasttrackit.onlineshop.service.CustomerService;
import org.fasttrackit.onlineshop.steps.CustomerTestSteps;
import org.fasttrackit.onlineshop.steps.ProductTestSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CustomerServiceIntegrationTests {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTestSteps customerTestSteps;

    @Autowired
    private ProductTestSteps productTestSteps;

    @Test
    void createCustomer_whenValidRequest_thenCustomerIsCreated() {
        customerTestSteps.createCustomer();
    }
}
