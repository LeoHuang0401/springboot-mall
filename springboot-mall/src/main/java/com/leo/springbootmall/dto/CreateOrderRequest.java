package com.leo.springbootmall.dto;


import javax.validation.constraints.NotEmpty;
import java.util.List;

public class CreateOrderRequest {


    @NotEmpty
    private List<BuyItem> buyItemList;

    public List<BuyItem> getBuyItemList() {
        return buyItemList;
    }

    public void setButItemList(List<BuyItem> buyItemList) {
        this.buyItemList = buyItemList;
    }
}
