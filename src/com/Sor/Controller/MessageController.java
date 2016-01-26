package com.Sor.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.Sor.Model.*;
import com.Sor.Utils.Constants;

@Path("/messages")
public class MessageController {
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@QueryParam("userId") String userId, @QueryParam("messageId") String messageId,
			@Context SecurityContext securityContext) throws NotFoundException {
		// return delegate.messagesGetGet(userId,messageId,securityContext);
		Message response = new Message();
		response.setMessage("ceva");
		return response;
	}

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessage(@QueryParam("userId") String userId, @Context SecurityContext securityContext)
			throws NotFoundException {
		// return delegate.messagesGetGet(userId,messageId,securityContext);
		Message msg = new Message();
		msg.setMessage("ceva");
		List<Message> response = new ArrayList<Message>();
		response.add(msg);
		return response;
	}

	@POST
	@Path("/send")
	@Produces(MediaType.TEXT_PLAIN)
	public String messagesSendPost(@QueryParam("userId") String userId, @QueryParam("userDestName") String userDestName,
			@QueryParam("message") String message, @Context SecurityContext securityContext) throws NotFoundException {
		return Constants.Succes;
	}
}
