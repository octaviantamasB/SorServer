package com.Sor.Model;

import java.util.Objects;

public class Message {
	private String userId = null;
	private String destId = null;
	private String message = null;
	private String messageDate = null;
	private Boolean messageRead = null;

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
	 * id destination of the message
	 **/

	public String getDestId() {
		return destId;
	}

	public void setDestId(String destId) {
		this.destId = destId;
	}

	/**
	 * message body
	 **/

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * message sent date
	 **/

	public String getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}

	/**
	 * if the message was read or not
	 **/

	public Boolean getMessageRead() {
		return messageRead;
	}

	public void setMessageRead(Boolean messageRead) {
		this.messageRead = messageRead;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Message message = (Message) o;
		return Objects.equals(userId, message.userId) && Objects.equals(destId, message.destId)
				&& Objects.equals(message, message.message) && Objects.equals(messageDate, message.messageDate)
				&& Objects.equals(messageRead, message.messageRead);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, destId, message, messageDate, messageRead);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Message {\n");

		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    destId: ").append(toIndentedString(destId)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    messageDate: ").append(toIndentedString(messageDate)).append("\n");
		sb.append("    messageRead: ").append(toIndentedString(messageRead)).append("\n");
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
