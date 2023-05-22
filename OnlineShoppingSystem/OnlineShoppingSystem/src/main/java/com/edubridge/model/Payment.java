package com.edubridge.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@SequenceGenerator(name="seq_payment",sequenceName="PaymentSequence",initialValue=200,allocationSize=100)
	@GeneratedValue(generator="seq_payment")
	private int paymentId;
	@Column(name="payment_type" )
	String paymentType;
	@Column(name="amount")
	double amount;
	@JsonFormat(pattern="yyyy/mm/dd")
	private Date paymentDate;
	
	
	@OneToOne
	@JoinColumn(name="cart_id")
	private Cart cart_id;
	
	

	public Cart getCart_id() {
		return cart_id;
	}
	public void setCart_id(Cart cart_id) {
		this.cart_id = cart_id;
	}
	@OneToOne
	@JoinColumn(name="user_id")
	private User user_id;
	
	
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
		
	}
	
	public Payment() {
		
	}
	
	
	public Payment(int paymentId, String paymentType, double amount, Date paymentDate, User user_id) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.user_id = user_id;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", amount=" + amount
				+ ", paymentDate=" + paymentDate + ", cart_id=" + cart_id + ", user_id=" + user_id + "]";
	}
	
	
	
	
	
	

}
