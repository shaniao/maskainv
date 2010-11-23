package com.mask.hrs.po;

/**
 * HotelTeamuser entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class HotelTeamuser implements java.io.Serializable {

	// Fields

	private Integer teamId;
	private String firstName;
	private String lastName;
	private String coName;
	private String address;
	private String postcodeCity;
	private String country;
	private String username;
	private String email;
	private String password;
	private String userNumber;
	private String billCoName;
	private String billAddress;
	private String billPostcodeCity;
	private String billCountry;
	private String coTel;
	private String coMobile;
	private String coFax;
	private String language;
	private String currency;

	// Constructors

	/** default constructor */
	public HotelTeamuser() {
	}

	/** minimal constructor */
	public HotelTeamuser(String firstName, String lastName, String address,
			String postcodeCity, String country, String username, String email,
			String password, String billAddress, String billPostcodeCity,
			String billCountry, String coTel, String language, String currency) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postcodeCity = postcodeCity;
		this.country = country;
		this.username = username;
		this.email = email;
		this.password = password;
		this.billAddress = billAddress;
		this.billPostcodeCity = billPostcodeCity;
		this.billCountry = billCountry;
		this.coTel = coTel;
		this.language = language;
		this.currency = currency;
	}

	/** full constructor */
	public HotelTeamuser(String firstName, String lastName, String coName,
			String address, String postcodeCity, String country,
			String username, String email, String password, String userNumber,
			String billCoName, String billAddress, String billPostcodeCity,
			String billCountry, String coTel, String coMobile, String coFax,
			String language, String currency) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.coName = coName;
		this.address = address;
		this.postcodeCity = postcodeCity;
		this.country = country;
		this.username = username;
		this.email = email;
		this.password = password;
		this.userNumber = userNumber;
		this.billCoName = billCoName;
		this.billAddress = billAddress;
		this.billPostcodeCity = billPostcodeCity;
		this.billCountry = billCountry;
		this.coTel = coTel;
		this.coMobile = coMobile;
		this.coFax = coFax;
		this.language = language;
		this.currency = currency;
	}

	// Property accessors

	public Integer getTeamId() {
		return this.teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCoName() {
		return this.coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcodeCity() {
		return this.postcodeCity;
	}

	public void setPostcodeCity(String postcodeCity) {
		this.postcodeCity = postcodeCity;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getBillCoName() {
		return this.billCoName;
	}

	public void setBillCoName(String billCoName) {
		this.billCoName = billCoName;
	}

	public String getBillAddress() {
		return this.billAddress;
	}

	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}

	public String getBillPostcodeCity() {
		return this.billPostcodeCity;
	}

	public void setBillPostcodeCity(String billPostcodeCity) {
		this.billPostcodeCity = billPostcodeCity;
	}

	public String getBillCountry() {
		return this.billCountry;
	}

	public void setBillCountry(String billCountry) {
		this.billCountry = billCountry;
	}

	public String getCoTel() {
		return this.coTel;
	}

	public void setCoTel(String coTel) {
		this.coTel = coTel;
	}

	public String getCoMobile() {
		return this.coMobile;
	}

	public void setCoMobile(String coMobile) {
		this.coMobile = coMobile;
	}

	public String getCoFax() {
		return this.coFax;
	}

	public void setCoFax(String coFax) {
		this.coFax = coFax;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}