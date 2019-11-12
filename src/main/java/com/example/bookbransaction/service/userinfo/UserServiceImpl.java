package com.example.bookbransaction.service.userinfo;

import com.example.bookbransaction.entity.Shop;
import com.example.bookbransaction.entity.User;
import com.example.bookbransaction.mapper.ShopMapper;
import com.example.bookbransaction.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Resource
    private ShopMapper shopMapper;
    @Override
    public User findByUserName(String name) {
        User user = userMapper.selectByUserName(name);
        if(user!= null && 2 == user.getType()){
            Shop shop = shopMapper.selectByUserId(user.getId());
            user.setShop(shop);
        }
        return user;
    }

    @Override
    public User findById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        if(user!= null && 2 == user.getType()){
            Shop shop = shopMapper.selectByUserId(user.getId());
            user.setShop(shop);
        }
        return user;
    }

    @Override
    public User registration(User record) {
        int userId = userMapper.insert(record);
        record.setId(userId);
        if(2 == record.getType()){
            Shop shop = record.getShop();
            shop.setUserId(userId);
            int shopId = shopMapper.insert(shop);
            shop.setShopId(shopId);
            record.setShop(shop);
        }
        return record;
    }
}
