/**
 * 
 */
package com.cesarmata.ws30restfulwebservicesimplementinghetoas.dto;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * @author Cesar Mata.
 *
 */

public class User {
	
	private Integer id;
	
	@Size(min = 2, message = "Name should have atleast  2 characters")
	private String name;
	
	@Past
	private Date birthday;
	
	public User() {
		
	}
	
	public User(Integer id, String name, Date birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}
}