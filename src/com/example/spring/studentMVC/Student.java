package com.example.spring.studentMVC;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotEmpty
	@NotNull(message="required field")
	@Size(min=1,message="must not be empty")
	private String firstName;
	@NotNull(message="required field")
	@Size(min=1,message="must not be empty")
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
