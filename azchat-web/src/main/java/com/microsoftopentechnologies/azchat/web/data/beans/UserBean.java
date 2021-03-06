/*
Copyright (c) Microsoft Open Technologies, Inc.  All rights reserved.
 
The MIT License (MIT)
 
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
 
The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.
 
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package com.microsoftopentechnologies.azchat.web.data.beans;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/**
 * This data bean holds the data for user details,user friend details and user
 * content share details.
 * 
 * @author Dnyaneshwar_Pawar
 *
 */
public class UserBean extends BaseBean {

	/**
	 * Generated serial version ID.
	 */
	private static final long serialVersionUID = 5077784067016794520L;
	private String userID;
	private String nameID;
	private String idProvider;
	private String firstName;
	private String lastName;
	private String photoUrl;
	private String email;
	private String countryCD;
	private String phoneNo;
	private List<UserPrefBean> usrPrefList;
	private String samplToken;
	private boolean isNewUser;
	private List<FriendRequestBean> friendList;
	private int pendingFriendReq;
	private MultipartFile multipartFile;
	private UserMessageListBean userMessageListBean;
	private String contentLevel;

	/**
	 * 
	 * @return the user id
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * 
	 * @param userID
	 *            the user id to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the nameID
	 */
	public String getNameID() {
		return nameID;
	}

	/**
	 * @param nameID
	 *            the nameID to set
	 */
	public void setNameID(String nameID) {
		this.nameID = nameID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * @param photoUrl
	 *            the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the countryCD
	 */
	public String getCountryCD() {
		return countryCD;
	}

	/**
	 * @param countryCD
	 *            the countryCD to set
	 */
	public void setCountryCD(String countryCD) {
		this.countryCD = countryCD;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the usrPrefList
	 */
	public List<UserPrefBean> getUsrPrefList() {
		return usrPrefList;
	}

	/**
	 * @param usrPrefList
	 *            the usrPrefList to set
	 */
	public void setUsrPrefList(List<UserPrefBean> usrPrefList) {
		this.usrPrefList = usrPrefList;
	}

	/**
	 * @return the samplToken
	 */
	public String getSamplToken() {
		return samplToken;
	}

	/**
	 * @param samplToken
	 *            the samplToken to set
	 */
	public void setSamplToken(String samplToken) {
		this.samplToken = samplToken;
	}

	/**
	 * @return the isNewUser
	 */
	public boolean isNewUser() {
		return isNewUser;
	}

	/**
	 * @param isNewUser
	 *            the isNewUser to set
	 */
	public void setNewUser(boolean isNewUser) {
		this.isNewUser = isNewUser;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Name ID : " + this.nameID + " Identity Provider : "
				+ this.idProvider + " First Name : " + firstName
				+ " Last Name : " + this.lastName + " Email " + this.email);
		return sb.toString();
	}

	/**
	 * @return the friendList
	 */
	public List<FriendRequestBean> getFriendList() {
		return friendList;
	}

	/**
	 * @param friendList
	 *            the friendList to set
	 */
	public void setFriendList(List<FriendRequestBean> friendList) {
		this.friendList = friendList;
	}

	/**
	 * @return the idProvider
	 */
	public String getIdProvider() {
		return idProvider;
	}

	/**
	 * @param idProvider
	 *            the idProvider to set
	 */
	public void setIdProvider(String idProvider) {
		this.idProvider = idProvider;
	}

	/**
	 * @return the pendingFriendReq
	 */
	public int getPendingFriendReq() {
		return pendingFriendReq;
	}

	/**
	 * @param pendingFriendReq
	 *            the pendingFriendReq to set
	 */
	public void setPendingFriendReq(int pendingFriendReq) {
		this.pendingFriendReq = pendingFriendReq;
	}

	/**
	 * @return the multipartFile
	 */
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	/**
	 * @param multipartFile
	 *            the multipartFile to set
	 */
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	/**
	 * @return the userMessageListBean
	 */
	public UserMessageListBean getUserMessageListBean() {
		return userMessageListBean;
	}

	/**
	 * @param userMessageListBean
	 *            the userMessageListBean to set
	 */
	public void setUserMessageListBean(UserMessageListBean userMessageListBean) {
		this.userMessageListBean = userMessageListBean;
	}

	/**
	 * @return the contentLevel
	 */
	public String getContentLevel() {
		return contentLevel;
	}

	/**
	 * @param contentLevel
	 *            the contentLevel to set
	 */
	public void setContentLevel(String contentLevel) {
		this.contentLevel = contentLevel;
	}

}
