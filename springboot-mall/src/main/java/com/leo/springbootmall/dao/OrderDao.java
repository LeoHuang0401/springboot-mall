package com.leo.springbootmall.dao;

import com.leo.springbootmall.dto.OrderQueryParams;
import com.leo.springbootmall.dto.ProductQueryParams;
import com.leo.springbootmall.model.Order;
import com.leo.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);


    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsById(Integer orderId);
    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
