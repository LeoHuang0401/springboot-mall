package com.leo.springbootmall.dto;


import com.leo.springbootmall.constant.ProductCategory;

public class ProductQueryParams {
    ProductCategory category;
    String search;
    String ortherBy;
    String sort;
    Integer limit;
    Integer offset;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getOrtherBy() {
        return ortherBy;
    }

    public void setOrtherBy(String ortherBy) {
        this.ortherBy = ortherBy;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
