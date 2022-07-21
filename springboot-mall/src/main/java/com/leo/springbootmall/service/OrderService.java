package com.leo.springbootmall.service;


import com.leo.springbootmall.dto.CreateOrderRequest;
import com.leo.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
