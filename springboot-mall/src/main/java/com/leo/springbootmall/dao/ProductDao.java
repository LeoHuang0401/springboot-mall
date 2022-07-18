package com.leo.springbootmall.dao;


import com.leo.springbootmall.constant.ProductCategory;
import com.leo.springbootmall.dto.ProductRequest;
import com.leo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category,String seacrch);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(int productId);
}
