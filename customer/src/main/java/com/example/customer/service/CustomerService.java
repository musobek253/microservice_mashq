package com.example.customer.service;

import com.example.customer.CustomerRepo;
import com.example.customer.CustomerRequest;
import com.example.customer.model.Customer;

import lombok.AllArgsConstructor;
import org.example.cilents.fraud.FraudCheckResponse;
import org.example.cilents.fraud.FraudCilents;
import org.example.cilents.notification.NotificationCilent;
import org.example.cilents.notification.NotificationRequest;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;
    private final FraudCilents fraudCilents;
    private final NotificationCilent notificationCilent;
    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        customerRepo.saveAndFlush(customer);
        FraudCheckResponse fraudCheckResponse = fraudCilents.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()){
            throw new IllegalStateException ("fraudster");
        }
        notificationCilent.sendNotification(
                new NotificationRequest(
                        customer.getId(),
                        customer.getEmail(),
                        String.format("Hi %s welcome to Musobek....", customer.getFirstName())
                )
        );

    }

}
