package com.example.deliveryservice.service;

import com.example.deliveryservice.model.DeliveryAgent;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    boolean scheduleDelivery(int orderId, DeliveryAgent deliveryAgent);
    List<DeliveryAgent> getAllDeliveries();
    // Other methods related to delivery service
    Optional<DeliveryAgent> findByAgentId(int agentId);

    DeliveryAgent getDeliveryAgent(int agentId);
}
