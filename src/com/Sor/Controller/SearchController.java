package com.Sor.Controller;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.Sor.Model.*;
@Path("/search")
public class SearchController {

	@GET
	@Path("/searchOrganization")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Organization> getSearchOrganization(List<RequestedInfo> requestedInfo,
			@Context SecurityContext securityContext) throws NotFoundException {
		Organization org = new Organization();
		List<Organization> response = new ArrayList<Organization>();
		response.add(org);
		return response;
		// return
		// delegate.searchSearchOrganizationGet(requestedInfo,securityContext);
	}

	@GET
	@Path("/searchPerson")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getSearchPerson(List<RequestedInfo> requestedInfo, @Context SecurityContext securityContext)
			throws NotFoundException {
		Person per = new Person();
		List<Person> response = new ArrayList<Person>();
		response.add(per);
		return response;
		// return delegate.searchSearchPersonGet(requestedInfo,securityContext);
	}

	// suggest organizations for the persons
	@GET
	@Path("/suggestOrganizations")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Organization> getSuggestOrganization(@QueryParam("userId") String userId,
			@Context SecurityContext securityContext) throws NotFoundException {
		Organization org = new Organization();
		List<Organization> response = new ArrayList<Organization>();
		response.add(org);
		return response;
		// return
		// delegate.searchSuggestOrganizationsGet(userId,userType,securityContext);
	}

	// suggest persons for an organizations(type is organization) and friends
	// for persons(type is person)
	@GET
	@Path("/suggestPersons")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getSuggestPerson(@QueryParam("userId") String userId, @QueryParam("type") String type,
			@Context SecurityContext securityContext) throws NotFoundException {
		Person per = new Person();
		List<Person> response = new ArrayList<Person>();
		response.add(per);
		return response;
		// return
		// delegate.searchSuggestPersonGet(userId,userType,securityContext);
	}
}
