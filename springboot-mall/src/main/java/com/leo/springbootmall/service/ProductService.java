package com.leo.springbootmall.service;


import com.leo.springbootmall.constant.ProductCategory;
import com.leo.springbootmall.dto.ProductRequest;
import com.leo.springbootmall.model.Product;

import java.util.List;

public interface ProductService {


    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
