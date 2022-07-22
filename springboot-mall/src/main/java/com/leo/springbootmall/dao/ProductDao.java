package com.leo.springbootmall.dao;



import com.leo.springbootmall.dto.ProductQueryParams;
import com.leo.springbootmall.dto.ProductRequest;
import com.leo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(int productId);
}
