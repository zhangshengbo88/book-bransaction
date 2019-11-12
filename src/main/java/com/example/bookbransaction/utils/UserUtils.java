package com.example.bookbransaction.utils;

import com.example.bookbransaction.entity.User;
import org.apache.shiro.SecurityUtils;

public class UserUtils {
    public static final String USER = "USER_SESSION";
    public static final String ROLE = "ROLE_SESSION";

    public static Integer getLogonId() {
        User sysUser = (User) SecurityUtils.getSubject().getSession().getAttribute(USER);
        return sysUser.getId();
    }

    public static User getLogonUser() {
        return (User) SecurityUtils.getSubject().getSession().getAttribute(USER);
    }

}
