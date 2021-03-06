# Documentation

In this section, we describe all the features of the SF-Java-Ui. 

## Supported Fields
We start with the supported fields. Each field is rendered based on annotations and the different properties provided and filled by the developer, so in the section below we define the different properties supported by each field. 
For more details please visit [the Angular Schema Form documentation](https://github.com/json-schema-form/angular-schema-form/blob/master/docs/index.md#form-types)

### TextField:

To render a field as a TextField the developer must add the [@TextField](../src/main/java/io/asfjava/ui/core/form/TextField.java) annotation to his field. 

| Properties        | Type           | Usage |
| -------------     |:-------------: | :-----|
| title             | String         | The title of the field |
| placeHolder       | String         | Placeholder on inputs |
| description       | String         | A description, can be HTML |
| minLength         | Integer        | Min text length |
| maxLength         | Integer        | Max text length |
| pattern           | String (regEx) | Reg Ex used to validate the input |
| validationMessage | String         | A custom validation error message |
| readOnly          | Boolean        | Make the field readOnly |
| noTitle           | Boolean        | Set to true to hide title |
| fieldAddonLeft    | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the left side of the Text Field |
| fieldAddonRight   | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the right side of the Text Field |

The code below is an example using the TextField annotation. Feel free to try this code snippet:

```Java
import java.io.Serializable;

import io.asfjava.ui.core.form.TextField;

public class DemoForm implements Serializable {

	@TextField(title = "Full Name", minLenght = 3)
	private String fullName;

	@TextField(title = "Email", pattern = "^\\S+@\\S+$")
	private String mail;

	@TextField(title = "Repository", fieldAddonLeft = "https://github.com/")
	private String githubRepository;

	@TextField(title = "Github user name", fieldAddonRight = "@Github.com")
	private String githubUserName;

	public String getMail() {
		return mail;
	}

	public String getFullName() {
		return fullName;
	}

	public String getGithubRepository() {
		return githubRepository;
	}

	public String getGithubUserName() {
		return githubUserName;
	}
}

```

1- Demo TextField

![Demo TextField](images/textField.png)



### NumberField:

The given component can be used to fill numeric values, it can be applied to fields of type [java.lang.Number](https://docs.oracle.com/javase/7/docs/api/java/lang/Number.html) (Integer, Long, Double, Float, etc ...). The developer must use the [@Number](../src/main/java/io/asfjava/ui/core/form/Number.java) in this case.

| Properties        | Type           | Usage |
| -------------     |:-------------: | :-----|
| title             | String         | The title of the field |
| placeHolder       | String         | Placeholder on inputs |
| description       | String         | A description, can be HTML |
| validationMessage | String         | A custom validation error message |
| readOnly          | Boolean        | Make the field readOnly |
| noTitle           | Boolean        | Set to true to hide title |
| fieldAddonLeft    | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the left side of the Number Field |
| fieldAddonRight   | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the right side of the Number Field |

The code below is an example using the Number annotation. Feel free to try this code snippet:


```Java
import java.io.Serializable;

import io.asfjava.ui.core.form.Number;

public class DemoForm implements Serializable {

	@Number(title = "Average", description = "This a double")
	private Double average;

	@Number(title = "Rating", placeHolder = "Rate me")
	private short rating;

	@Number(title = "USA Phone Number", fieldAddonLeft = "+1")
	private Long phone;

	@Number(title = "Amount", fieldAddonRight = "$")
	private Double amount;

	public Double getAverage() {
		return average;
	}

	public short getRating() {
		return rating;
	}

	public Long getPhone() {
		return phone;
	}

	public Double getAmount() {
		return amount;
	}

}


```

2- Demo NumberField

![Demo NumberField](images/numberField.png)


### PasswordField:

For some use cases, the developer need to use a encrypted UI input field to fill the user value. So he can use [@Password](../src/main/java/io/asfjava/ui/core/form/Password.java).

| Properties        | Type           | Usage |
| -------------     |:-------------: | :-----|
| title             | String         | The title of the field |
| placeHolder       | String         | Placeholder on inputs |
| description       | String         | A description, can be HTML |
| minLength         | Integer        | Min text length |
| maxLength         | Integer        | Max text length |
| pattern           | String (regEx) | Reg Ex used to validate the input |
| validationMessage | String         | A custom validation error message |
| readOnly          | Boolean        | Make the field readOnly |
| noTitle           | Boolean        | Set to true to hide title |
| fieldAddonLeft    | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the left side of the Password Field |
| fieldAddonRight   | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the right side of the Password Field |

The code below is an example using the Password annotation. Feel free to try this code snippet:

```Java

import java.io.Serializable;

import io.asfjava.ui.core.form.Password;

public class DemoForm implements Serializable {

	@Password(title = "Password", description = "Fill your password")
	private String password;

	public String getPassword() {
		return password;
	}

}

```

3- Demo PasswordField

![Demo PasswordField](images/passwordField.png)


### TextArea

The TextArea component is a multiline text field with a border and optional scroll bars. To use a this component the developer must use [@TextArea](../src/main/java/io/asfjava/ui/core/form/TextArea.java)

| Properties        | Type           | Usage |
| -------------     |:-------------: | :-----|
| title             | String         | The title of the field |
| placeHolder       | String         | Placeholder on inputs |
| description       | String         | A description, can be HTML |
| minLength         | Integer        | Min text length |
| maxLength         | Integer        | Max text length |
| validationMessage | String         | A custom validation error message |
| readOnly          | Boolean        | Make the field readOnly |
| noTitle           | Boolean        | Set to true to hide title |
| fieldAddonLeft    | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the left side of the Text Area |
| fieldAddonRight   | String         | [Extend form controls](http://getbootstrap.com/components/#input-groups) by adding text on the right side of the Text Area |

The code below is an example using the TextArea annotation. Feel free to try this code snippet:

```Java

import java.io.Serializable;

import io.asfjava.ui.core.form.TextArea;

public class DemoForm implements Serializable {

	@TextArea(title = "Comment", description = "Add your Comment here", placeHolder = "fill your comment please")
	private String comment;

	@TextArea(title = "Tweet", placeHolder = "This message will be tweeted", maxLenght = 140, validationMessage = Messages.TWEET_VALIDATION)
	private String tweet;

	@TextArea(title = "Fill a message", minLenght = 50)
	private String message;

	public String getComment() {
		return comment;
	}

	public String getTweet() {
		return tweet;
	}

	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = -5073515619469444978L;
}

```

4- Demo TextArea

![Demo TextArea](images/textArea.png)

