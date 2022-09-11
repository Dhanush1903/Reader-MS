package com.reader.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reader {
	@Id
private String readerEmail;
private Long cardNumber;
private Long cvv;
private String readerName;
private Integer id;
public String getReaderEmail() {
	return readerEmail;
}
public void setReaderEmail(String readerEmail) {
	this.readerEmail = readerEmail;
}
public Long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(Long cardNumber) {
	this.cardNumber = cardNumber;
}
public Long getCvv() {
	return cvv;
}
public void setCvv(Long cvv) {
	this.cvv = cvv;
}
public String getReaderName() {
	return readerName;
}
public void setReaderName(String readerName) {
	this.readerName = readerName;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Reader(String readerEmail, Long cardNumber, Long cvv, String readerName, Integer id) {
	super();
	this.readerEmail = readerEmail;
	this.cardNumber = cardNumber;
	this.cvv = cvv;
	this.readerName = readerName;
	this.id = id;
}
public Reader() {
	super();
}
	
}
