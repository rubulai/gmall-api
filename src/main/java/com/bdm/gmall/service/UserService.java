package com.bdm.gmall.service;

import java.util.List;

import com.bdm.gmall.bean.UserAddress;

/**
 * �û�����ӿ�
 * @author lenovo
 *
 */
public interface UserService {
	
	/**
	 * ���û�id���ջ���ַ
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
