package com.Sor.Model;

import java.util.*;

public class Organization {
	private String userId = null;
	private String userName = null;
	private String userMail = null;
	private String userAddress = null;
	private List<Knowledge> knowledge = new ArrayList<Knowledge>();
	private List<Job> jobesSearched = new ArrayList<Job>();
	private List<Person> employees = new ArrayList<Person>();

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
	 * What the person should know, may be linked to a certain job.
	 **/

	public List<Knowledge> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(List<Knowledge> knowledge) {
		this.knowledge = knowledge;
	}

	/**
	 * Jobs that you want to hire.
	 **/

	public List<Job> getJobessearched() {
		return jobesSearched;
	}

	public void setJobessearched(List<Job> jobesSearched) {
		this.jobesSearched = jobesSearched;
	}

	/**
	 * Employees of the organization.
	 **/

	public List<Person> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Organization organization = (Organization) o;
		return Objects.equals(userId, organization.userId) && Objects.equals(userName, organization.userName)
				&& Objects.equals(userMail, organization.userMail)
				&& Objects.equals(userAddress, organization.userAddress)
				&& Objects.equals(knowledge, organization.knowledge)
				&& Objects.equals(jobesSearched, organization.jobesSearched)
				&& Objects.equals(employees, organization.employees);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, userName, userMail, userAddress, knowledge, jobesSearched, employees);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Organization {\n");

		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userMail: ").append(toIndentedString(userMail)).append("\n");
		sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
		sb.append("    knowledge: ").append(toIndentedString(knowledge)).append("\n");
		sb.append("    jobesSearched: ").append(toIndentedString(jobesSearched)).append("\n");
		sb.append("    employes: ").append(toIndentedString(employees)).append("\n");
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
