package com.bdm.gmall.service;

import java.util.List;

import com.bdm.gmall.bean.UserAddress;

/**
 * 用户服务接口
 * @author lenovo
 *
 */
public interface UserService {
	
	/**
	 * 据用户id查收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
