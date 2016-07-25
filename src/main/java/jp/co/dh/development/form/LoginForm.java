package jp.co.dh.development.form;

import org.seasar.struts.annotation.Required;

public class LoginForm {

	@Required
	private String email;
	@Required
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
