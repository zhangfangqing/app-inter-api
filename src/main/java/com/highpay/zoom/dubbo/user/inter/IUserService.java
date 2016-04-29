package com.highpay.zoom.dubbo.user.inter;

import java.util.List;

import com.highpay.zoom.dubbo.user.entity.User;

public interface IUserService {
	public List<User> getUsers();
}
