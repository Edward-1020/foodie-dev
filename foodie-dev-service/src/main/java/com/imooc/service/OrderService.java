package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.pojo.vo.OrderVO;

import java.util.List;

public interface OrderService {

    /**
     * 用户创建订单相关信息
     * @param submitOrderBO
     */
    public String createOrder(SubmitOrderBO submitOrderBO);

}
