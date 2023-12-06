package com.example.deliveryservice.controller;

import com.example.deliveryservice.model.DeliveryAgent;
import com.example.deliveryservice.repository.DeliveryRepository;
import com.example.deliveryservice.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController{

    @Autowired
    private final DeliveryRepository deliveryRepository;

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @GetMapping("/agentId")
    public Optional<DeliveryAgent> findByAgentId(int agentId) {
        return deliveryRepository.findByAgentId(agentId);
    }

    @GetMapping("/{orderId}")
    public DeliveryAgent getByOrderId(int orderId) {
        return deliveryRepository.getByOrderId(orderId);
    }

    @GetMapping("/all")
    public List<DeliveryAgent> getAllDeliveries() {
        return deliveryRepository.findAll();
    }
}
