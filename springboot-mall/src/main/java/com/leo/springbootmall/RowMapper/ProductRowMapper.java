package com.leo.springbootmall.RowMapper;

import com.leo.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setProductid(rs.getInt("product_id"));
        product.setProductname(rs.getString("product_name"));
        product.setCategory(rs.getString("category"));
        product.setImageurl(rs.getString("Image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        product.setCreateddate(rs.getDate("created_date"));
        product.setLastmodifieddate(rs.getDate("last_modified_date"));

        return product;
    }
}
