package com.lrz.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lrz.demo.domain.OrdersBean;

/**
 * 日志解析工具类
 * @Description:
 * @author:DARUI LI
 * @version:1.0.0
 * @Data:2018年11月23日 下午3:39:32
 */
public class LogInfoHandler {


	public OrdersBean getOrdersBean(String orderInfo) {

		OrdersBean order = new OrdersBean();
		// 从日志信息中过滤出订单信息
		Pattern orderPattern = Pattern.compile("orderNumber:.+");
		Matcher orderMatcher = orderPattern.matcher(orderInfo);
		if (orderMatcher.find()) {

			String orderInfoStr = orderMatcher.group(0);
			String[] orderInfoGroup = orderInfoStr.trim().split("\\|");

			// 获取订单号
			String orderNum = (orderInfoGroup[0].split(":"))[1].trim();
			order.setNumber(orderNum);

			// 获取创建时间
			String orderCreateTime = orderInfoGroup[1].trim().split(" ")[1] + " "
					+ orderInfoGroup[1].trim().split(" ")[2];
			try {
				order.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(orderCreateTime));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 获取商家名称
			String merchantName = (orderInfoGroup[4].split(":"))[1].trim();
			order.setMerchantName(merchantName);

			// 获取订单总额
			String orderPriceInfo = (orderInfoGroup[5].split("price:"))[1].trim();
			String totalPrice = (orderPriceInfo.substring(2, orderPriceInfo.length() - 3).trim().split(" "))[1];
			order.setTotalPrice(Float.parseFloat(totalPrice));

			return order;

		} else {
			return order;
		}
	}
}
