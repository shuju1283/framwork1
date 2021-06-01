package com.shiju.dao.impl;

import com.shiju.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("userDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao中的save方法执行了...");
    }
}
