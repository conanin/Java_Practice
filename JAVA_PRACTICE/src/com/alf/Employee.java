package com.alf;

public class Employee {
	
	private String userName;
	
	public void setUserName(String username)
	{
		this.userName = username;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	private String alias;
	
	public void setAlias(String alias)
	{
		this.alias=alias;
	}
	
	public String getAlias()
	{
		return this.alias;
	}
	
	private Long userId;
	
	public void setUserId(Long userId)
	{
		this.userId = userId;
	}
	
	public Long getUserId()
	{
		return this.userId;
	}
}
