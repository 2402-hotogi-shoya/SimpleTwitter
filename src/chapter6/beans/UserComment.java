package chapter6.beans;

import java.util.Date;

public class UserComment {

    private int id;
    private String text;
    private int userId;
    private String account;
    private String name;
    private int messageId;
    private Date createdDate;
    private Date updatedDate;


    public int getId(){
    	return id;
    }
    public String getText(){
    	return text;
    }
    public int getUserId(){
    	return userId;
    }
    public String getAccount(){
    	return account;
    }
    public String getName(){
    	return name;
    }
    public int getMessageId(){
    	return messageId;
    }
    public Date getCreatedDate(){
    	return createdDate;
    }
    public Date getUpdatedDate(){
    	return updatedDate;
    }


    public void setId(int id){
    	this.id = id;
    }
    public void setText(String text){
    	this.text = text;
    }
    public void setUserId(int userId){
    	this.userId = userId;
    }
    public void setAccount(String account){
    	this.account = account;
    }
    public void setName(String name){
    	this.name = name;
    }
    public void setMessageId(int messageId){
    	this.messageId = messageId;
    }
    public void setCreatedDate(Date createdDate){
    	this.createdDate = createdDate;
    }
    public void setUpdatedDate(Date updatedDate){
    	this.updatedDate = updatedDate;
    }
}
