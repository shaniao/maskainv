package com.mask.hrs.po;


/**
 * HotelReservation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class HotelReservation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reservationId;
	private String hotelId;
	private String comeTime;
	private String leftTime;
	private Integer singleRoom;
	private Integer adultNum;
	private Integer childrenNum;
	private Integer doubleRoom;
	private String password;
	private String customName;
	private String customEmail;
	private String customTel;
	private String reservationType;

	// Constructors

	/** default constructor */
	public HotelReservation() {
	}

	/** minimal constructor */
	public HotelReservation(String reservationId, String hotelId,
			String comeTime, String leftTime, String customName,
			String customEmail, String customTel, String reservationType) {
		this.reservationId = reservationId;
		this.hotelId = hotelId;
		this.comeTime = comeTime;
		this.leftTime = leftTime;
		this.customName = customName;
		this.customEmail = customEmail;
		this.customTel = customTel;
		this.reservationType = reservationType;
	}

	/** full constructor */
	public HotelReservation(String reservationId, String hotelId,
			String comeTime, String leftTime, Integer singleRoom, Integer adultNum,
			Integer childrenNum, Integer doubleRoom, String password,
			String customName, String customEmail, String customTel,
			String reservationType) {
		this.reservationId = reservationId;
		this.hotelId = hotelId;
		this.comeTime = comeTime;
		this.leftTime = leftTime;
		this.singleRoom = singleRoom;
		this.adultNum = adultNum;
		this.childrenNum = childrenNum;
		this.doubleRoom = doubleRoom;
		this.password = password;
		this.customName = customName;
		this.customEmail = customEmail;
		this.customTel = customTel;
		this.reservationType = reservationType;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getComeTime() {
		return this.comeTime;
	}

	public void setComeTime(String comeTime) {
		this.comeTime = comeTime;
	}

	public String getLeftTime() {
		return this.leftTime;
	}

	public void setLeftTime(String leftTime) {
		this.leftTime = leftTime;
	}

	public Integer getSingleRoom() {
		return this.singleRoom;
	}

	public void setSingleRoom(Integer singleRoom) {
		this.singleRoom = singleRoom;
	}

	public Integer getAdultNum() {
		return this.adultNum;
	}

	public void setAdultNum(Integer adultNum) {
		this.adultNum = adultNum;
	}

	public Integer getChildrenNum() {
		return this.childrenNum;
	}

	public void setChildrenNum(Integer childrenNum) {
		this.childrenNum = childrenNum;
	}

	public Integer getDoubleRoom() {
		return this.doubleRoom;
	}

	public void setDoubleRoom(Integer doubleRoom) {
		this.doubleRoom = doubleRoom;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getCustomEmail() {
		return this.customEmail;
	}

	public void setCustomEmail(String customEmail) {
		this.customEmail = customEmail;
	}

	public String getCustomTel() {
		return this.customTel;
	}

	public void setCustomTel(String customTel) {
		this.customTel = customTel;
	}

	public String getReservationType() {
		return this.reservationType;
	}

	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}

}