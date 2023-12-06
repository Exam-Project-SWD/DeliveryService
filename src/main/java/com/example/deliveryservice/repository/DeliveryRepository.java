package com.example.deliveryservice.repository;

import com.example.deliveryservice.model.DeliveryAgent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeliveryRepository extends JpaRepository<DeliveryAgent, Integer> {

    Optional<DeliveryAgent> findByAgentId(int agentId);

    DeliveryAgent getByOrderId(int orderId);
    DeliveryAgent getDeliveryAgent(int agentId);
}
