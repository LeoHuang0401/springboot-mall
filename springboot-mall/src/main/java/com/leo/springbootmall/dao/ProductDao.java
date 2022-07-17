package com.leo.springbootmall.dao;


import com.leo.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
