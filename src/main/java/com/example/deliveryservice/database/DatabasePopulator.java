package com.example.deliveryservice.database;

import com.example.deliveryservice.model.DeliveryAgent;
import com.example.deliveryservice.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class DatabasePopulator {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public void populate() {
        // Sample data for delivery table
        int[] ids = {1, 2, 3};
        String[] name = {"Delivery Agent 1", "Delivery Agent 2", "Delivery Agent 3"};
        String[] phoneNumbers = {"1234567890", "9876543210", "5555555555"};
        int[] orderIds = {101, 102, 103};

        // Insert data into the delivery table using the repository
        for (int i = 0; i < ids.length; i++) {
            DeliveryAgent delivery = new DeliveryAgent();
            delivery.setAgentId(ids[i]);
            delivery.setName(name[i]);
            delivery.setPhoneNumber(phoneNumbers[i]);
            delivery.setOrderId(orderIds[i]);

            deliveryRepository.save(delivery);
        }

        System.out.println("Data inserted successfully!");
    }
}
