package jp.co.dh.development.form;

import java.util.Date;

import org.seasar.struts.annotation.Required;

public class MyPageForm {

    public String nickName;

    @Required
    public String sex;

    @Required
    public Date birthDate;

    @Required
    public String mailAddress;

    @Required
    public String mailAddressConfirm;

    @Required
    public String password;

    @Required
    public String passwordConfirm;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMailAddressConfirm() {
		return mailAddressConfirm;
	}

	public void setMailAddressConfirm(String mailAddressConfirm) {
		this.mailAddressConfirm = mailAddressConfirm;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
}
