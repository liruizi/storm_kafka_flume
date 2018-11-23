package com.lrz.demo.domain;

import java.util.Date;

/**
 * 订单实体类
 * 
 * @Description:
 * @author:DARUI LI
 * @version:1.0.0
 * @Data:2018年11月23日 下午3:40:13
 */
public class OrdersBean {
	Date createTime = null;
	String number = "";
	String paymentNumber = "";
	Date paymentDate = null;
	String merchantName = "";
	float totalPrice = 0;
	float discount = 0;
	float paymentPrice = 0;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getPaymentPrice() {
		return paymentPrice;
	}

	public void setPaymentPrice(float paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

}
