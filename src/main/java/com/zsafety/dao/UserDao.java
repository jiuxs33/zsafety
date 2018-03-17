package com.zsafety.dao;

import java.util.List;

import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import com.zsafety.model.TUser;

@SqlResource("user")
public interface UserDao extends BaseMapper<TUser> {
	public TUser findUserById(long id);
	public List<TUser> findUserByName(TUser user);
}
