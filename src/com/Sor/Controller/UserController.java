package com.Sor.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.Sor.Model.*;
import com.Sor.Utils.Constants;

@Path("/user")
public class UserController {
	// http://localhost:8080/SorServer/rest/user/login?userName=Examples&userPassword=09709
	@GET
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public LoginResponse getUserLogin(@QueryParam("userName") String userName,
			@QueryParam("userPassword") String userPassword, @Context SecurityContext securityContext)
					throws NotFoundException {
		// return
		// viewPerson.getUserLogin(userName,userPassword,securityContext);
		LoginResponse response = new LoginResponse();
		response.setLogedin(true);
		response.setUserId(userName);
		response.setUserType(Constants.Person);
		return response;
	}

	// http://localhost:8080/SorServer/rest/user/login?userName=Examples&userMail=mail@yahoo.com&userPassword=09709&userType=person
	@POST
	@Path("/register")
	@Produces(MediaType.APPLICATION_JSON)
	public RegisterResponse postUserRegister(@QueryParam("userName") String userName,
			@QueryParam("userMail") String userMail, @QueryParam("userPassword") String userPassword,
			@QueryParam("userType") String userType, @Context SecurityContext securityContext)
					throws NotFoundException {
		// return
		// delegate.userRegisterPost(userName,userMail,userPassword,userType,securityContext);
		RegisterResponse response = new RegisterResponse();
		response.setLogedin(true);
		response.setUserId(userName);
		response.setUserType(Constants.Person);
		return response;
	}
//uita-te http://examples.javacodegeeks.com/enterprise-java/rest/jersey/json-example-with-jersey-jackson/
	@PUT
	@Path("/editPerson")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String putEditPerson(Person person, @Context SecurityContext securityContext) throws NotFoundException {
		return Constants.Succes;
		// return delegate.userEditPersonPut(person,securityContext);
	}

}
