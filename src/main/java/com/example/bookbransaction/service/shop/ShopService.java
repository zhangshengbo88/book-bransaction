package com.example.bookbransaction.service.shop;

import com.example.bookbransaction.entity.Shop;

public interface ShopService {
    Shop findShopByUserId(Integer userId);
    Integer add(Shop shop);
}
