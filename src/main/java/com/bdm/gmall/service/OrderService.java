package com.bdm.gmall.service;

import java.util.List;

import com.bdm.gmall.bean.UserAddress;

public interface OrderService {
	public List<UserAddress> initOrder(String userId);
}
