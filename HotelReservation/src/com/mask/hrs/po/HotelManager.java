package com.mask.hrs.po;

/**
 * HotelManager entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class HotelManager implements java.io.Serializable {

	// Fields

	private Integer idHotelManager;
	private String username;
	private String password;
	private String comment;

	// Constructors

	/** default constructor */
	public HotelManager() {
	}

	/** minimal constructor */
	public HotelManager(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public HotelManager(String username, String password, String comment) {
		this.username = username;
		this.password = password;
		this.comment = comment;
	}

	// Property accessors

	public Integer getIdHotelManager() {
		return this.idHotelManager;
	}

	public void setIdHotelManager(Integer idHotelManager) {
		this.idHotelManager = idHotelManager;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}