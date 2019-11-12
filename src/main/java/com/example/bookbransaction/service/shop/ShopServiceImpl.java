package com.example.bookbransaction.service.shop;

import com.example.bookbransaction.entity.Shop;
import com.example.bookbransaction.mapper.ShopMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ShopServiceImpl implements ShopService{
    @Resource
    private ShopMapper shopMapper;
    @Override
    public Shop findShopByUserId(Integer userId) {
        return shopMapper.selectByUserId(userId);
    }

    @Override
    public Integer add(Shop shop) {
        return shopMapper.insert(shop);
    }
}
