package com.Sor.Model;

import java.util.*;

public class RequestedInfo {
	private String userName = null;
	private String localization = null;
	private List<Knowledge> knowledge = new ArrayList<Knowledge>();
	private List<Job> jobSearched = new ArrayList<Job>();
	private List<Hobby> hobbies = new ArrayList<Hobby>();

	/**
	 * The person that you search name(ex:all the persons that have the name Ion
	 * or similar).
	 **/

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Should the localization be only from a certain place
	 **/

	public String getLocalization() {
		return localization;
	}

	public void setLocalization(String localization) {
		this.localization = localization;
	}

	/**
	 * What he should know
	 **/

	public List<Knowledge> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(List<Knowledge> knowledge) {
		this.knowledge = knowledge;
	}

	/**
	 * What jobs he should be good for
	 **/

	public List<Job> getJobSearched() {
		return jobSearched;
	}

	public void setJobSearched(List<Job> jobSearched) {
		this.jobSearched = jobSearched;
	}

	/**
	 * What hobby he should have
	 **/

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RequestedInfo requestedInfo = (RequestedInfo) o;
		return Objects.equals(userName, requestedInfo.userName)
				&& Objects.equals(localization, requestedInfo.localization)
				&& Objects.equals(knowledge, requestedInfo.knowledge)
				&& Objects.equals(jobSearched, requestedInfo.jobSearched)
				&& Objects.equals(hobbies, requestedInfo.hobbies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName, localization, knowledge, jobSearched, hobbies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RequestedInfo {\n");

		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    localization: ").append(toIndentedString(localization)).append("\n");
		sb.append("    knowledge: ").append(toIndentedString(knowledge)).append("\n");
		sb.append("    jobSearched: ").append(toIndentedString(jobSearched)).append("\n");
		sb.append("    hobbies: ").append(toIndentedString(hobbies)).append("\n");
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
