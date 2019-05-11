package com.duqinzong.crm.settings.service.impl;

import com.duqinzong.crm.settings.dao.UserDao;
import com.duqinzong.crm.settings.service.UserService;
import com.duqinzong.crm.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Author  都钦宗
 */
public class UserServiceimpl implements UserService {
    private static UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

}
