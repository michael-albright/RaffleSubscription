package com.tts.subscriberlist.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

//Tell the JPA we want to store Objects of the class to the database
//Atable named subscriber will automatically be created
@Entity 
public class Subscriber {

	@Id //Mark the id field as our database primary key
	@GeneratedValue(strategy=GenerationType.AUTO) //id will be auto generated value
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	
	@Column //attribute is stored in a database table column whose names matches
			// that of the persistent field or property
	@CreationTimestamp //Sets the value of the data field to the current time and date
						// when created
	private Date signedUp;
	
	public Subscriber() {
		super();
	}

	public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
		super(); // This calls the empty constructor of the superclass (Object)
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.signedUp = signedUp;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", signedUp=" + signedUp + "]";
	}
	
	

}
