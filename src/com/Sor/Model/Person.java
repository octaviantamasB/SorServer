package com.Sor.Model;

import java.util.*;

public class Person {

	private String userId = null;
	private String userName = null;
	private String userMail = null;
	private String userAddress = null;
	private List<Hobby> hobbies = new ArrayList<Hobby>();
	private List<Worked> worked = new ArrayList<Worked>();
	private List<Knowledge> knowledge = new ArrayList<Knowledge>();
	private List<Job> jobesSearched = new ArrayList<Job>();
	private List<Person> friends = new ArrayList<Person>();

	/**
	 * Unique identifier.
	 **/
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * user name.
	 **/
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * user email.
	 **/
	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	/**
	 * user address.
	 **/

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	/**
	 * Hobbies of the person.
	 **/

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * Jobs that the person had.
	 **/

	public List<Worked> getWorked() {
		return worked;
	}

	public void setWorked(List<Worked> worked) {
		this.worked = worked;
	}

	/**
	 * What he knows of the person.
	 **/

	public List<Knowledge> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(List<Knowledge> knowledge) {
		this.knowledge = knowledge;
	}

	/**
	 * Jobs of the person.
	 **/

	public List<Job> getJobesSearched() {
		return jobesSearched;
	}

	public void setJobesSearched(List<Job> jobesSearched) {
		this.jobesSearched = jobesSearched;
	}

	/**
	 * Friends of the person.
	 **/
	public List<Person> getFriends() {
		return friends;
	}

	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(userId, person.userId) && Objects.equals(userName, person.userName)
				&& Objects.equals(userMail, person.userMail) && Objects.equals(userAddress, person.userAddress)
				&& Objects.equals(hobbies, person.hobbies) && Objects.equals(worked, person.worked)
				&& Objects.equals(knowledge, person.knowledge) && Objects.equals(jobesSearched, person.jobesSearched)
				&& Objects.equals(friends, person.friends);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, userName, userMail, userAddress, hobbies, worked, knowledge, jobesSearched,
				friends);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Person {\n");

		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userMail: ").append(toIndentedString(userMail)).append("\n");
		sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
		sb.append("    hobbies: ").append(toIndentedString(hobbies)).append("\n");
		sb.append("    worked: ").append(toIndentedString(worked)).append("\n");
		sb.append("    knowledge: ").append(toIndentedString(knowledge)).append("\n");
		sb.append("    jobesSearched: ").append(toIndentedString(jobesSearched)).append("\n");
		sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
