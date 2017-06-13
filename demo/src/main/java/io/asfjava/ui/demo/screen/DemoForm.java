package io.asfjava.ui.demo.screen;

import java.io.Serializable;

import io.asfjava.ui.core.form.Index;
import io.asfjava.ui.core.form.Password;
import io.asfjava.ui.core.form.TextField;

public class DemoForm implements Serializable {

	@Index(3)
	@TextField(title = "Personal Website")
	private String webSite;

	@Index(2)
	@TextField(title = "Your Github Mail")
	private String gitHub;

	@Index(4)
	@Password(title = "Password")
	private String password;

	@Index(0)
	@TextField(title = "First Name")
	private String firstName;

	// @Tab(title = "Info", index = 1)
	// @TextField(title = "Last Name", placeHolder = "Your last name")
	// private String lastName;
	//
	// @Tab(title = "Contact", index = 2)
	// @TextField(title = "eMail", placeHolder = "Your email", pattern =
	// "^\\S+@\\S+$", validationMessage = "Your mail must be in this format
	// jhondoe@example.com", description = "This is Text Field with pattern and
	// validation message")
	// private String email;
	//
	// @Tab(title = "Additional Info", index = 3)
	// @Number(title = "Number of children", placeHolder = "Number of children",
	// description = "This is a number")
	// private Integer number;
	//
	//
	// @Tab(title = "Info", index = 1)
	// @ComboBox(title = "Gender", titleMap = GenderTitleMap.class)
	// private String gender;
	//
	//// @Tab(title = "Additional Info", index = 3)
	// @ComboBox(title = "Currency", values = { "euro", "dollar" })
	// private String currency;
	//
	// @Tab(title = "Additional Info", index = 3)
	// @RadioBox(title = "Civil State", titleMap = CivilStateTitelsMap.class)
	// private String civilState;
	//
	//// @Tab(title = "Contact", index = 2)
	// @TextArea(title = "Address", placeHolder = "Fill your address please",
	// description = "This is textarea")
	// private String address;

	// @Tab(title = "Additional Info", index = 3)
	// @CheckBox(title = "Color", values = { "red", "bleu", "green" },
	// defaultvalue = "red")
	// private String color;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// public String getLastName() {
	// return lastName;
	// }
	//
	// public void setEmail(String eMail) {
	// this.email = eMail;
	// }
	//
	// public String getEmail() {
	// return email;
	// }

	public void setGitHub(String github) {
		this.gitHub = github;
	}

	public String getGitHub() {
		return gitHub;
	}

	public void setWebSite(String website) {
		this.webSite = website;
	}

	public String getWebSite() {
		return webSite;
	}

	public String getFirstName() {
		return firstName;
	}
	// public void setLastName(String lastName) {
	// this.lastName = lastName;
	// }
	//
	// public Integer getNumber() {
	// return number;
	// }
	//
	// public void setNumber(Integer number) {
	// this.number = number;
	// }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// public String getGender() {
	// return gender;
	// }
	//
	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }
	//
	// public String getCivilState() {
	// return civilState;
	// }
	//
	// public void setCivilState(String civilState) {
	// this.civilState = civilState;
	// }
	//
	// public String getCurrency() {
	// return currency;
	// }

	// public String getColor() {
	// return color;
	// }

	private static final long serialVersionUID = -5073515619469444978L;
}
