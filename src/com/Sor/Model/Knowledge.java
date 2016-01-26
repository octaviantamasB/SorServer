package com.Sor.Model;

import java.util.Objects;

public class Knowledge {
	private String knowledgeId = null;
	private String knowledgeName = null;
	private String jobId = null;
	private String experience = null;

	/**
	 * Unique identifier.
	 **/

	public String getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	/**
	 * the name of the Knowledge
	 **/

	public String getKnowledgeName() {
		return knowledgeName;
	}

	public void setKnowledgeName(String knowledgeName) {
		this.knowledgeName = knowledgeName;
	}

	/**
	 * for what jobs is this knowldege asked(can be empty)
	 **/

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * 1 for beginer, 2 for advance, 3 for expert
	 **/

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Knowledge knowledge = (Knowledge) o;
		return Objects.equals(knowledgeId, knowledge.knowledgeId)
				&& Objects.equals(knowledgeName, knowledge.knowledgeName) && Objects.equals(jobId, knowledge.jobId)
				&& Objects.equals(experience, knowledge.experience);
	}

	@Override
	public int hashCode() {
		return Objects.hash(knowledgeId, knowledgeName, jobId, experience);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Knowledge {\n");

		sb.append("    knowledgeId: ").append(toIndentedString(knowledgeId)).append("\n");
		sb.append("    knowledgeName: ").append(toIndentedString(knowledgeName)).append("\n");
		sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
		sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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
