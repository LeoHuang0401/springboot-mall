package com.leo.springbootmall.service.imp;


import com.leo.springbootmall.dao.ProductDao;
import com.leo.springbootmall.model.Product;
import com.leo.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductDao productDao;


    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);
    }
}
