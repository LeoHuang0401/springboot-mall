package com.leo.springbootmall.service;


import com.leo.springbootmall.dto.CreateOrderRequest;
import com.leo.springbootmall.dto.OrderQueryParams;
import com.leo.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
