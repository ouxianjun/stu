package com.jt.cart.mapper;

import org.apache.ibatis.annotations.Select;

import com.jt.common.mapper.SysMapper;
import com.jt.common.po.Cart;

public interface CartMapper extends SysMapper<Cart>{
	@Select("select * from tb_cart where item_id = #{itemId} and user_id = #{userId}")
	Cart findCartByUI(Cart cart);

	void updateCartNum(Cart cart);
	
	
	
}
