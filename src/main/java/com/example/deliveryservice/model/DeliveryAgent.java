package com.example.deliveryservice.model;


import jakarta.persistence.*;

@Entity
@Table(name = "agent")
public class DeliveryAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agent_id", unique = true)
    private int agentId;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name="order_id")
    private int orderId;

    // Constructors, getters, setters, and other methods

    // Example constructor
    public DeliveryAgent(int agentId,String name, String phoneNumber,int orderId) {
        this.orderId = orderId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public DeliveryAgent() {

    }

    // Example getters and setters
    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Other methods specific to DeliveryAgent


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
