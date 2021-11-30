package com.Sample.Cascade.dto;

public class OrderResponse {

    private String name;
    private String p_name;

    public OrderResponse(String name, String p_name) {
        this.name = name;
        this.p_name = p_name;
    }
    private int price;
}
